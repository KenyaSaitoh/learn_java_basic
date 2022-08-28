package pro.kensait.java.reflection;

import java.lang.reflect.Method;

public class ReflectionMain7 {

    public static void main(String[] args) {
        new ReflectionMain7().executeTask();
    }

    private void executeTask() {
        // 以下のいずれもmethodはnullになる。
        // Method method = this.getClass().getEnclosingMethod();
        // Method method = new Object().getClass().getEnclosingMethod();

        Method method = new Object(){}.getClass().getEnclosingMethod();
        System.out.println(method.getName());
    }
}