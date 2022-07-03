package pro.kensait.java.reflection;

import java.lang.reflect.Field;

class ReflectionTarget5 {

    public static final String versionNumber = "1.00";
    public int subValue = 20;
    String subName = "Bar";
}

/* ======================================== */
public class ReflectionMain5 {

    public static void main(String[] args) {
        try {
            // クラスオブジェクトを取得する。
            Class clazz = Class.forName("org.study.se.reflection.ReflectionTarget5");
            Object obj = clazz.newInstance();

            System.out.println("===== 宣言されたフィールドの値を表示 =====");
            // 定数
            Field field1 = clazz.getDeclaredField("versionNumber");
            String fieldValue1 = (String)field1.get(obj); // 引数として渡すObject型変数は、対象クラスのオブジェクト
            System.out.println("versionNumber ---> " + fieldValue1);

            // インスタンスフィールド（プリミティブ型）
            Field field2 = clazz.getDeclaredField("subValue");
            int fieldValue2 = field2.getInt(obj); // 引数として渡すObject型変数は、対象クラスのオブジェクト
            System.out.println("subValue ---> " + fieldValue2);

            // インスタンスフィールド（クラス型）
            Field field3 = clazz.getDeclaredField("subName");
            String fieldValue3 = (String)field3.get(obj); // 引数として渡すObject型変数は、対象クラスのオブジェクト
            System.out.println("subName ---> " + fieldValue3);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}