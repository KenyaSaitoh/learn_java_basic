package pro.kensait.java.cuifw;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class Util {
    public static Field[] sortFields(Class<?> modelClass) {
        Field[] fields = modelClass.getDeclaredFields();
        Arrays.sort(fields, new Comparator<Field>() {
            @Override
            public int compare(Field f1, Field f2) {
                f1.setAccessible(true);
                f2.setAccessible(true);
                ModelInfo info1 = f1.getAnnotation(ModelInfo.class);
                ModelInfo info2 = f2.getAnnotation(ModelInfo.class);
                if (info1 != null && info2 != null) {
                    return info1.order() - info2.order();
                } else if (info1 != null && info2 == null) {
                    return -1;
                } else if (info1 == null && info2 != null) {
                    return 1;
                }
                return f1.getName().compareTo(f2.getName());
            }
        });
        return fields;
    }

    public static List<Method> sortMenu(Class<?> modelClass) {
        Method[] methods = modelClass.getMethods();
        List<Method> targetMethod = new ArrayList<>();
        for (Method method : methods) {
            ConsoleMenu menu = method.getAnnotation(ConsoleMenu.class);
            if (menu != null) {
                targetMethod.add(method);
            }
        }
        Collections.sort(targetMethod, new Comparator<Method>() {
            @Override
            public int compare(Method m1, Method m2) {
                ConsoleMenu info1 = m1.getAnnotation(ConsoleMenu.class);
                ConsoleMenu info2 = m2.getAnnotation(ConsoleMenu.class);
                if (info1 != null && info2 != null) {
                    return info1.order() - info2.order();
                } else if (info1 != null && info2 == null) {
                    return -1;
                } else if (info1 == null && info2 != null) {
                    return 1;
                }
                return m1.getName().compareTo(m2.getName());
            }
        });
        return targetMethod;
    }

    public static Parameter[] sortParams(Method targetMethod) {
        Parameter[] params = targetMethod.getParameters();
        Arrays.sort(params, new Comparator<Parameter>() {
            @Override
            public int compare(Parameter p1, Parameter p2) {
                ParamInfo info1 = p1.getAnnotation(ParamInfo.class);
                ParamInfo info2 = p2.getAnnotation(ParamInfo.class);
                if (info1 != null && info2 != null) {
                    return info1.order() - info2.order();
                } else if (info1 != null && info2 == null) {
                    return -1;
                } else if (info1 == null && info2 != null) {
                    return 1;
                }
                return p1.getName().compareTo(p2.getName());
            }
        });
        return params;
    }

    public static <T> List<String> createConsoleTable(
            Field[] modelFields, List<T> modelList) {
        try {
            List<Integer> columnLengthList = new ArrayList<>();
            for (Field field : modelFields) {
                int maxLength = field.getName().length();
                for (T model : modelList) {
                    field.setAccessible(true);
                    Object modelValue = field.get(model);
                    Class<?> ft = field.getType();
                    String modelValueStr = null;
                    if (ft == Integer.class || ft == Integer.TYPE) {
                        modelValueStr = String.valueOf((Integer) modelValue);
                    } else if (ft == LocalDate.class) {
                        LocalDate date = (LocalDate) modelValue;
                        modelValueStr = date.format(DateTimeFormatter.ofPattern("y/M/d"));
                    } else {
                        modelValueStr = modelValue.toString();
                    }
                    if (maxLength < modelValueStr.length()) {
                        maxLength = modelValueStr.length();
                    }
                }
                columnLengthList.add(maxLength);
            }

            // 罫線を作る
            String ruledLine = "+";
            for (int length : columnLengthList) {
                for (int i = 0; i < length; i++) {
                    ruledLine += "-";
                }
                ruledLine += "+";
            }

            // タイトル行を作る
            List<String> table = new ArrayList<>();
            table.add(ruledLine);
            String titleRow = "|";
            for (int i = 0; i< modelFields.length; i++) {
                Field field =  modelFields[i];
                String fieldName = field.getName();
                titleRow += fieldName;
                int diff = columnLengthList.get(i) - fieldName.length();
                for (int j = 0; j < diff; j++) {
                    titleRow += " ";
                }
                titleRow += "|";
            }
            table.add(titleRow);
            table.add(ruledLine);

            // モデル行を作る
            for (T model : modelList) {
                String modelRow = "|";
                for (int i = 0; i < modelFields.length; i++) {
                    Field mf = modelFields[i];
                    mf.setAccessible(true);
                    Object modelValue = mf.get(model);
                    Class<?> ft = mf.getType();
                    String modelValueStr = null;
                    if (ft == Integer.class || ft == Integer.TYPE) {
                        modelValueStr = String.valueOf((Integer) modelValue);
                        int diff = columnLengthList.get(i) - modelValueStr.length();
                        for (int j = 0; j < diff; j++) {
                            modelRow += " ";
                        }
                        modelRow += modelValueStr;
                    } else {
                        if (ft == LocalDate.class) {
                            LocalDate date = (LocalDate) modelValue;
                            modelValueStr = date.format(DateTimeFormatter.ofPattern("y/M/d"));
                        } else {
                            modelValueStr = modelValue.toString();
                        }
                        modelRow += modelValueStr;
                        int diff = columnLengthList.get(i) - modelValueStr.length();
                        for (int j = 0; j < diff; j++) {
                            modelRow += " ";
                        }
                    }
                    modelRow += "|";
                }
                table.add(modelRow);
            }
            table.add(ruledLine);
            return table;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    public static <T> List<String> createConsoleTable(
            Field[] modelFields, Set<T> modelSet) {
        List<T> modelList = new ArrayList<>(modelSet);
        return createConsoleTable(modelFields, modelList);
    }
}
