package pro.kensait.java.reflection;

import java.lang.reflect.Method;

class ReflectionTarget3 {

    public String sayWords(String name, int age) {
        String words = name + " is " + age + " years old";
        return words;
    }
}

/* ======================================== */
public class ReflectionMain3 {

    public static void main(String[] args) throws Exception {
        try {
            // クラスオブジェクトを取得する。
            Class clazz = Class.forName("org.study.se.reflection.ReflectionTarget3");

            // メソッドオブジェクトを取得する。
            Class[] params = { String.class, Integer.TYPE };
            Method method = clazz.getMethod("sayWords", params);

            // メソッドを実行する。
            Object[] objs = new Object[2];
            objs[0] = "Foo";
            objs[1] = new Integer(35);
            System.out.println("===== メソッドを実行 =====");
            Object result = method.invoke(clazz.newInstance(), objs);

            // 戻り値を表示する。
            System.out.println(result);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}