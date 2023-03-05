package pro.kensait.java.cuifw;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.math.BigDecimal;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ConsoleApplication {
    private static final String MENU_PREFIX = "** ";
    private static final String BAR_SEGMENT = "=====";
    private static final String INPUT_PREFIX = ">> ";
    private static final String OUTPUT_PREFIX = "## ";
    private static final String OUTPUT_PREFIX_2 = "#### ";
    public static final String MENU_TARGET_ERROR =
            "[ERROR] メニューにない数値が選択されています";
    public static final String PARAM_MODEL_COUNT_ERROR =
            "[ERROR] 引数に指定できるモデルは1つだけです";
    public static final String INVALIDATE_TYPE_ERROR =
            "[ERROR] モデルの仕様に反する型が引数に指定されています";
    public static final String INVALIDATE_FORMAT_ERROR =
            "[ERROR] 正しいフォーマットで入力されていません";
    public static final String BOOLEAN_FORMAT_ERROR =
            "[ERROR] Boolean値が正しく入力されていません";
    public static final String NUMBER_FORMAT_ERROR =
            "[ERROR] 数値が正しく入力されていません";
    public static final String ENUM_VALUE_ERROR =
            "[ERROR] 当該列挙型には指定されは列挙値は存在しません";
    public static final String DATE_FORMAT_ERROR =
            "[ERROR] 日付が正しいフォーマットで入力されていません";
    
    public static void run(Class<?> clazz, String[] args) {
        // モデルのセットアップ
        setUpModel(clazz);

        // データのセットアップ
        setUpData(clazz);

        // コンソールからの入力による引数リストの作成
        Processor processor = clazz.getAnnotation(Processor.class);
        if (processor == null) {
            throw new RuntimeException("@Processorが付与されていません");
        }
        Class<?> processorClass = processor.value();
        List<Method> menus = Util.sortMenu(processorClass);
        int menuId = 0;

        Map<Integer, Method> menuMap = new HashMap<>();
        Map<Integer, String> menuNameMap = new HashMap<>();
        Map<Integer, String> menuQuestionMap = new HashMap<>();
        for (Method menu : menus) {
            menuId++;
            menuMap.put(menuId, menu);
            ConsoleMenu menuInfo = menu.getAnnotation(ConsoleMenu.class);
            Question questionInfo = menu.getAnnotation(Question.class);
            String menuName = menuInfo.title().equals("") ? menu.getName() : menuInfo.title();
            menuNameMap.put(menuId, menuName);
            if (questionInfo != null) {
                menuQuestionMap.put(menuId, questionInfo.value());
            } 
        }

        try (Scanner sc = new Scanner(System.in)) {
            int menuInput = 0;
            // メインループ
            MAIN_LOOP: while (true) {
                System.out.println(BAR_SEGMENT + " [開始] " + BAR_SEGMENT);
                System.out.println(" 0: 終了");
                for (Map.Entry<Integer, String> entry : menuNameMap.entrySet()) {
                    String edge = entry.getKey() < 10 ? " " : "";
                    System.out.println(edge + entry.getKey() + ": " + entry.getValue());
                }
                // メニューループ
                MENU_LOOP: while (true) {
                    try {
                        System.out.println();
                        System.out.print(MENU_PREFIX + "メニューを選択してください => ");
                        menuInput = Integer.parseInt(sc.nextLine());
                        if (menuInput == 0)
                            break MAIN_LOOP;
                        if (0 < menuInput && menuInput <= menuId) {
                            break MENU_LOOP;
                        }
                        System.out.println(MENU_TARGET_ERROR);
                    } catch (NumberFormatException nfe) {
                        System.out.println(NUMBER_FORMAT_ERROR);
                    }
                }
                System.out.println();
                System.out.println(BAR_SEGMENT + " [" + menuNameMap.get(menuInput) +
                        "] " + BAR_SEGMENT);
                if (menuQuestionMap.get(menuInput) != null) {
                    System.out.println(menuQuestionMap.get(menuInput));
                }
                // 引数を生成する
                Method targetMethod = menuMap.get(menuInput);
                Parameter[] params = Util.sortParams(targetMethod);
                checkParameter(params);
                List<Object> paramValueList = null;
                if (params.length == 1
                        && params[0].getType() == ModelManager.getModelClass()) {
                    paramValueList = createModelAsSingleParam(sc);
                } else {
                    paramValueList = createParamValueList(sc, params);
                }
                Object[] paramArray = paramValueList.toArray(new Object[0]);
                System.out.println(OUTPUT_PREFIX + "引数 => " + paramValueList);
 
                // Processorを呼び出す
                Object targetInstance = processorClass.getDeclaredConstructor()
                        .newInstance();
                Object result = null;
                try {
                    result = targetMethod.invoke(targetInstance, paramArray);
                    showResult(result);
                } catch (Exception e) {
                    Throwable th = e.getCause();
                    if (th != null) {
                        showException(th);
                    } else {
                        showException(e);
                    }
                }
                System.out.println();
                System.out.println(OUTPUT_PREFIX + "エンターキーでトップへ（0で終了）");
                String succeed = sc.nextLine();
                if ("0".equals(succeed))
                    break MAIN_LOOP;
            }
            System.out.println(BAR_SEGMENT + " [終了] " + BAR_SEGMENT);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    // モデルをセットアップする
    private static void setUpModel(Class<?> clazz) {
        Model modelAnno = clazz.getAnnotation(Model.class);
        if (modelAnno != null) {
            checkModel(modelAnno.value());
            ModelManager.setModelClass(modelAnno.value());
            ModelManager.setFields(Util.sortFields(modelAnno.value()));
            ModelManager.setModelCsvPath(Paths.get(modelAnno.path()));
        }
    }

    // データをセットアップする
    private static void setUpData(Class<?> clazz) {
        Data dataAnno = clazz.getAnnotation(Data.class);
        if (dataAnno != null) {
            DataHolder.setIntData(dataAnno.intData());
            DataHolder.setStringData(dataAnno.stringData());
        }
    }

    private static void checkModel(Class<?> modelClass) {
        Field[] fields = modelClass.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            checkType(field.getType(), field.getName());
        }
    }

    private static void checkParameter(Parameter[] params) {
        int count = 0;
        for (Parameter param : params) {
            checkType(param.getType(), param.getName());
            if (param.getType() == ModelManager.getModelClass()) {
                count++;
            }
        }
        if (1 < count) {
            throw new RuntimeException(PARAM_MODEL_COUNT_ERROR);
        }
    }

    private static void checkType(Class<?> type, String name) {
        if (! (
                type == Boolean.class ||
                type == Boolean.TYPE ||
                type == Integer.class ||
                type == Integer.TYPE ||
                type == Double.class ||
                type == Double.TYPE ||
                type == BigDecimal.class ||
                type.isEnum() ||
                type == LocalDate.class ||
                type == String.class
                )) {
            throw new RuntimeException(ConsoleApplication.INVALIDATE_TYPE_ERROR +
                    " (" + name +")");
        }
    }
    
    private static List<Object> createModelAsSingleParam(Scanner sc) {
        try {
            Object instance = null;
            try {
                instance = ModelManager.getModelClass().getDeclaredConstructor()
                        .newInstance();
            } catch (NoSuchMethodException nsme) {
                throw new RuntimeException(
                        "モデルにデフォルトコンストラクタが定義されていません");
            }
            List<Object> paramValueList = new ArrayList<>();
            for (Field field : ModelManager.getFields()) {
                ModelInfo modelInfo = field.getAnnotation(ModelInfo.class);
                String fieldName = modelInfo.name();
                if (fieldName == null || fieldName.equals("")) {
                    fieldName = field.getName();
                }
                @SuppressWarnings("rawtypes")
                Class ft = field.getType();
                PARAM_LOOP: while (true) {
                    if (ft == Boolean.class || ft == Boolean.TYPE) {
                        System.out.print(INPUT_PREFIX + fieldName + " (true/false) => ");
                        try {
                            Boolean val = Boolean.parseBoolean(sc.nextLine());
                            field.set(instance, val);
                            break PARAM_LOOP;
                        } catch (Exception e) {
                            System.out.println(BOOLEAN_FORMAT_ERROR);
                            continue PARAM_LOOP;
                        }
                    } else if (ft == Integer.class || ft == Integer.TYPE) {
                        System.out.print(INPUT_PREFIX + fieldName + " (int) => ");
                        try {
                            Integer val = Integer.parseInt(sc.nextLine());
                            field.set(instance, val);
                            break PARAM_LOOP;
                        } catch (NumberFormatException nfe) {
                            System.out.println(NUMBER_FORMAT_ERROR);
                            continue PARAM_LOOP;
                        }
                    } else if (ft == Double.class || ft == Double.TYPE) {
                        System.out.print(INPUT_PREFIX + fieldName + " (double) => ");
                        try {
                            Double val = Double.parseDouble(sc.nextLine());
                            field.set(instance, val);
                            break PARAM_LOOP;
                        } catch (NumberFormatException nfe) {
                            System.out.println(NUMBER_FORMAT_ERROR);
                            continue PARAM_LOOP;
                        }
                    } else if (ft == BigDecimal.class) {
                        System.out.print(INPUT_PREFIX + fieldName + " (BigDecimal) => ");
                        try {
                            BigDecimal val = new BigDecimal(sc.nextLine());
                            field.set(instance, val);
                            break PARAM_LOOP;
                        } catch (NumberFormatException nfe) {
                            System.out.println(NUMBER_FORMAT_ERROR);
                            continue PARAM_LOOP;
                        }
                    } else if (ft.isEnum()) {
                        List<Object> enumList = Arrays.asList(ft.getEnumConstants());
                        List<String> enumStrList = new ArrayList<>();
                        for (Object obj : enumList) {
                            enumStrList.add(obj.toString());
                        }
                        String enumValueStr = String.join(", ", enumStrList);
                        System.out.print(INPUT_PREFIX + fieldName + " (" +
                                enumValueStr + ") => ");
                        try {
                            @SuppressWarnings("unchecked")
                            Enum<?> en = Enum.valueOf(ft, sc.nextLine());
                            field.set(instance, en);
                            break PARAM_LOOP;
                        } catch (Exception e) {
                            System.out.println(ENUM_VALUE_ERROR);
                            continue PARAM_LOOP;
                        }
                    } else if (ft == LocalDate.class) {
                        System.out.print(INPUT_PREFIX + fieldName + " (yyyy/M/d) => ");
                        try {
                            LocalDate date = LocalDate.parse(sc.nextLine(),
                                    DateTimeFormatter.ofPattern("y/M/d"));
                            field.set(instance, date);
                            break PARAM_LOOP;
                        } catch (DateTimeParseException dtpe) {
                            System.out.println(DATE_FORMAT_ERROR);
                            continue PARAM_LOOP;
                        }
                    } else if (ft == String.class) {
                        System.out.print(INPUT_PREFIX + fieldName + " (文字列) => ");
                        field.set(instance, sc.nextLine());
                        break PARAM_LOOP;
                    } else {
                        throw new RuntimeException(INVALIDATE_TYPE_ERROR);
                    }
                }
            }
            paramValueList.add(instance);
            return paramValueList;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static List<Object> createParamValueList(Scanner sc, Parameter[] params) {
        List<Object> paramValueList = new ArrayList<>();
        for (Parameter param : params) {
            ParamInfo paramInfo = param.getAnnotation(ParamInfo.class);
            String paramName = null;
            if (paramInfo == null) {
                paramName = param.getName();
            } else {
                paramName = paramInfo.name();
                if (paramName == null || paramName.equals("")) {
                    paramName = param.getName();
                }
            }
            @SuppressWarnings("rawtypes")
            Class pt = param.getType();
            PARAM_LOOP: while (true) {
                if (pt == Boolean.class || pt == Boolean.TYPE) {
                    System.out.print(INPUT_PREFIX + paramName + " (true/false) => ");
                    try {
                        Boolean val = Boolean.parseBoolean(sc.nextLine());
                        paramValueList.add(val);
                        break PARAM_LOOP;
                    } catch (Exception e) {
                        System.out.println(BOOLEAN_FORMAT_ERROR);
                        continue PARAM_LOOP;
                    }
                } else if (pt == Integer.class || pt == Integer.TYPE) {
                        System.out.print(INPUT_PREFIX + paramName + " (int) => ");
                        try {
                            Integer val = Integer.parseInt(sc.nextLine());
                            paramValueList.add(val);
                            break PARAM_LOOP;
                        } catch (NumberFormatException nfe) {
                            System.out.println(NUMBER_FORMAT_ERROR);
                            continue PARAM_LOOP;
                        }
                } else if (pt == Double.class || pt == Double.TYPE) {
                    System.out.print(INPUT_PREFIX + paramName + " (double) => ");
                    try {
                        Double val = Double.parseDouble(sc.nextLine());
                        paramValueList.add(val);
                        break PARAM_LOOP;
                    } catch (NumberFormatException nfe) {
                        System.out.println(NUMBER_FORMAT_ERROR);
                        continue PARAM_LOOP;
                    }
                } else if (pt == BigDecimal.class) {
                    System.out.print(INPUT_PREFIX + paramName + " (BigDecimal) => ");
                    try {
                        BigDecimal val = new BigDecimal(sc.nextLine());
                        paramValueList.add(val);
                        break PARAM_LOOP;
                    } catch (NumberFormatException nfe) {
                        System.out.println(NUMBER_FORMAT_ERROR);
                        continue PARAM_LOOP;
                    }
                } else if (pt.isEnum()) {
                    List<Object> enumList = Arrays.asList(pt.getEnumConstants());
                    List<String> enumStrList = new ArrayList<>();
                    for (Object obj : enumList) {
                        enumStrList.add(obj.toString());
                    }
                    String enumValueStr = String.join(", ", enumStrList);
                    System.out.print(INPUT_PREFIX + paramName + " (" +
                            enumValueStr + ") => ");
                    try {
                        @SuppressWarnings("unchecked")
                        Enum<?> en = Enum.valueOf(pt, sc.nextLine());
                        paramValueList.add(en);
                        break PARAM_LOOP;
                    } catch (Exception e) {
                        System.out.println(ENUM_VALUE_ERROR);
                        continue PARAM_LOOP;
                    }
                } else if (pt == LocalDate.class) {
                    System.out.print(INPUT_PREFIX + paramName + " (yyyy/M/d) => ");
                    try {
                        LocalDate date = LocalDate.parse(sc.nextLine(),
                                DateTimeFormatter.ofPattern("y/M/d"));
                        paramValueList.add(date);
                        break PARAM_LOOP;
                    } catch (DateTimeParseException dtpe) {
                        System.out.println(DATE_FORMAT_ERROR);
                        continue PARAM_LOOP;
                    }
                } else if (pt == String.class) {
                    System.out.print(INPUT_PREFIX + paramName + " (文字列) => ");
                    paramValueList.add(sc.nextLine());
                    break PARAM_LOOP;
                } else {
                    throw new RuntimeException(INVALIDATE_TYPE_ERROR);
                }
            }
        }
        return paramValueList;
    }

    private static void showResult(Object result) {
        System.out.print(OUTPUT_PREFIX + "結果 => ");
        sleepAWhile();
        if (result instanceof List<?> table) {
            List<String> tableStrList = Util.createConsoleTable(ModelManager.getFields(),
                    table);
            System.out.println();
            for (String line : tableStrList) {
                System.err.println(line);
            }
        } else if (result instanceof Map<?, ?> map) {
            System.out.println();
            for (Map.Entry<?, ?> entry : map.entrySet()) {
                System.err.println(entry.getKey() + " => " + entry.getValue());
            }
        } else {
            System.err.println(result);
        }
        sleepAWhile();
        /*
         * 結果を標準エラー出力するのは、赤字出力にして見た目を分かりやすくするため
         * であり、本来正しい使い方ではない。
         * なお、Eclipseのコンソールで文字に任意の色を付ける方法は、通常のコンソールとは異なる模様。
         * 現時点で未解決。
         */
    }

    private static void showException(Throwable th) {
        System.out.println(OUTPUT_PREFIX + "例外発生");
        sleepAWhile();
        System.err.println(OUTPUT_PREFIX_2 + "例外クラス => " +
                th.getClass().getCanonicalName());
        System.err.println(OUTPUT_PREFIX_2 + "メッセージ => " + th.getMessage());
        sleepAWhile();
    }

    private static void sleepAWhile() {
        try {
            Thread.sleep(300);
        } catch (InterruptedException ie) {
        };
    }
}