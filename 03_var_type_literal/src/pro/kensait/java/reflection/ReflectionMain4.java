package pro.kensait.java.reflection;

import java.lang.reflect.Field;

class ReflectionTarget4 extends ReflectionSuperTarget4 {

    public static final String versionNumber = "1.00";
    public int subValue = 20;
    @SuppressWarnings("unused")
    private int privateValue = 30;
    String subName = "Bar";
}

/* ======================================== */
class ReflectionSuperTarget4 {

    public String superName = "Foo";
    int superValue = 10;
}

/* ======================================== */
public class ReflectionMain4 {

    public static void main(String[] args) {
        try {
            // クラスオブジェクトを取得する。
            Class clazz = Class.forName("org.study.se.reflection.ReflectionTarget4");
            @SuppressWarnings("unused")
            Object obj = clazz.newInstance();

            // フィールドオブジェクト（宣言されたフィールド）を取得する。
            System.out.println("===== 宣言されたフィールドを表示 =====");
            Field[] declaredFieldList = clazz.getDeclaredFields();
            for (int i = 0; i < declaredFieldList.length; i++) {
                Field field = declaredFieldList[i];
                String fieldType = field.getType().getName();
                String fieldName = field.getName();
                // フィールド情報を表示する。
                System.out.println(fieldType + " / " + fieldName);
            }

            // フィールドオブジェクト（publicなフィールド）を取得する。
            System.out.println("===== publicなフィールドを表示 =====");
            Field[] publicFieldList = clazz.getFields();
            for (int i = 0; i < publicFieldList.length; i++) {
                Field field = publicFieldList[i];
                String fieldType = field.getType().getName();
                String fieldName = field.getName();
                // フィールド情報を表示する。
                System.out.println(fieldType + " / " + fieldName);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}