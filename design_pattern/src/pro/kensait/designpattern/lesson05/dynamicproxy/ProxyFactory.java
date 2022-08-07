package pro.kensait.designpattern.lesson05.dynamicproxy;

import java.lang.reflect.Proxy;

public class ProxyFactory {

    public static Object getProxy(String beanName) {
        Class clazz = null;
        try {
            // DIコンテナでは、引数として渡されたbeanNameをキーに定義ファイルを
            // 参照し、生成するクラスのFQCNを特定する。
            // ここでは、引数が"foo"だったらFooImpl、"bar"だったらBarImplとする。
            if ("foo".equals(beanName)) {
                clazz = Class.forName("org.study.ee.dynamicproxy.FooImpl");
            } else if ("bar".equals(beanName)) {
                clazz = Class.forName("org.study.ee.dynamicproxy.BarImpl");
            } else {
                new RuntimeException();
            }
        } catch(ClassNotFoundException cnfe) {
            throw new RuntimeException(cnfe);
        }

        Object target = null;
        try {
            target = clazz.newInstance();
        } catch(InstantiationException ie) {
            throw new RuntimeException(ie);
        } catch(IllegalAccessException iae) {
            throw new RuntimeException(iae);
        }

        Object proxy = Proxy.newProxyInstance(
                clazz.getClassLoader(),
                clazz.getInterfaces(),
                new DynamicProxy(target)); // 任意のオブジェクトのラッパーとなる
        return proxy;
    }
}