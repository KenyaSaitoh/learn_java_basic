package pro.kensait.java.reflection;

import java.lang.reflect.Method;

class ReflectionTarget2 {

    private String sayHello() {
        return "Hello World!";
    }
}

/* ======================================== */
public class ReflectionMain2 {

    public static void main(String[] args) {
        try {
            // クラスオブジェクトを取得する。
            Class clazz = Class.forName("org.study.se.reflection.ReflectionTarget2");

            // メソッドオブジェクトを取得する。
            Method method = clazz.getDeclaredMethod("sayHello", null);

            // privateメソッドをアクセス可能にする。
            method.setAccessible(true);

            // メソッドを実行する。
            Object ret = method.invoke(clazz.newInstance(), null);

            // 戻り値を表示する。
            System.out.println(ret);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}