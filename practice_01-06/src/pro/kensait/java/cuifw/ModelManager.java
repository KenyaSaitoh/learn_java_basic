package pro.kensait.java.cuifw;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class ModelManager<T> {
    private static Class<?> modelClass;
    private static Field[] fields;
    private static Path modelCsvPath;

    public static Class<?> getModelClass() {
        return modelClass;
    }

    public static void setModelClass(Class<?> modelClass) {
        ModelManager.modelClass = modelClass;
    }

    public static Field[] getFields() {
        return fields;
    }

    public static void setFields(Field[] fields) {
        ModelManager.fields = fields;
    }

    public static Path getModelCsvPath() {
        return modelCsvPath;
    }

    public static void setModelCsvPath(Path modelCsvPath) {
        ModelManager.modelCsvPath = modelCsvPath;
    }

    public static <T> List<T> readAll() {
        List<T> modelList = new ArrayList<T>();
        try (BufferedReader br = Files.newBufferedReader(modelCsvPath,
                StandardCharsets.UTF_8)) {
            String line;
            while ((line = br.readLine()) != null) {
                T model = createModelFromLine(line);
                modelList.add(model);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return modelList;
    }

    public static <T> void add(T target) {
        List<T> modelList = ModelManager.readAll();
        modelList.add(target);
        ModelManager.writeAll(modelList);
    }

    public static <T> void writeAll(List<T> modelList) {
        try (BufferedWriter bw = Files.newBufferedWriter(modelCsvPath,
                StandardCharsets.UTF_8)) {
            for (T model : modelList) {
                bw.write(createLineFromModel(model) + System.lineSeparator());
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static <T> String createLineFromModel(T model) throws Exception {
        List<String> lineList = new ArrayList<>();
        for (Field field : fields) {
            field.setAccessible(true);
            @SuppressWarnings("rawtypes")
            Class ft = field.getType();
            if (ft == Boolean.class || ft == Boolean.TYPE) {
                String str = String.valueOf((Boolean) field.get(model));
                lineList.add(str);
            } else if (ft == Integer.class || ft == Integer.TYPE) {
                String str = String.valueOf((Integer) field.get(model));
                lineList.add(str);
            } else if (ft == Double.class || ft == Double.TYPE) {
                String str = String.valueOf((Double) field.get(model));
                lineList.add(str);
            } else if (ft == BigDecimal.class) {
                String str = ((BigDecimal) field.get(model)).toString();
                lineList.add(str);
            } else if (ft.isEnum()) {
                Enum<?> en = (Enum<?>) field.get(model);
                lineList.add(en.name());
            } else if (ft == LocalDate.class) {
                LocalDate date = (LocalDate) field.get(model);
                String str = date.format(DateTimeFormatter.ofPattern("y/M/d"));
                lineList.add(str);
            } else if (ft == String.class) {
                String str = (String) field.get(model);
                lineList.add(str);
            } else {
                throw new RuntimeException(ConsoleApplication.INVALIDATE_TYPE_ERROR);
            }
        }
        String line = String.join(",", lineList);
        return line;
    }

    @SuppressWarnings("unchecked")
    private static <T> T createModelFromLine(String line) throws Exception {
        Object instance = modelClass.getDeclaredConstructor().newInstance();
        StringTokenizer st = new StringTokenizer(line, ",");
        for (Field field : fields) {
            field.setAccessible(true);
            @SuppressWarnings("rawtypes")
            Class ft = field.getType();
            try {
                if (ft == Boolean.class || ft == Boolean.TYPE) {
                    Boolean val = Boolean.parseBoolean(st.nextToken());
                    field.set(instance, val);
                    continue;
                } else if (ft == Integer.class || ft == Integer.TYPE) {
                    Integer val = Integer.parseInt(st.nextToken());
                    field.set(instance, val);
                    continue;
                } else if (ft == Double.class || ft == Double.TYPE) {
                    Double val = Double.parseDouble(st.nextToken());
                    field.set(instance, val);
                    continue;
                } else if (ft == BigDecimal.class) {
                    BigDecimal val = new BigDecimal(st.nextToken());
                    field.set(instance, val);
                    continue;
                } else if (ft.isEnum()) {
                    field.set(instance, Enum.valueOf(ft, st.nextToken()));
                    continue;
                } else if (ft == LocalDate.class) {
                    LocalDate date = LocalDate.parse(st.nextToken(),
                            DateTimeFormatter.ofPattern("y/M/d"));
                    field.set(instance, date);
                    continue;
                } else if (ft == String.class) {
                    field.set(instance, st.nextToken());
                    continue;
                }
            } catch (Exception e) {
                throw new RuntimeException(ConsoleApplication.INVALIDATE_FORMAT_ERROR);
            }
            throw new RuntimeException(ConsoleApplication.INVALIDATE_TYPE_ERROR);
        }
        return (T) instance;
    }
}