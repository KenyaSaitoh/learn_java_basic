package pro.kensait.designpattern2.proxy2.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxy implements InvocationHandler {

    private Object target;

    public DynamicProxy(Object target) {
        this.target = target;
    }

    public Object invoke(Object proxy, Method method, Object[] params) {
        try {
            System.out.println("[ DynamicProxy#invoke ] Start");
            System.out.println("[ DynamicProxy#invoke ] Call ---> " +
                    target.getClass().getName() + "." + method.getName());
            Object answer = method.invoke(target, params);
            System.out.println("[ DynamicProxy#invoke ] End");
            return answer;
        } catch (Exception e) {
            System.out.println(target.getClass().getName() + "#" +
                    method.getName());
            throw new RuntimeException(e);
        }
    }
}
