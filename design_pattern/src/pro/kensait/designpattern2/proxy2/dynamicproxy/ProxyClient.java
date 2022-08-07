package pro.kensait.designpattern2.proxy2.dynamicproxy;

public class ProxyClient {

    public static void main(String[] args) {

        // Foo呼び出し。
        System.out.println("[ ProxyClient ] ##### Start Foo #####");
        Foo foo = (Foo)ProxyFactory.getProxy("foo");
        int answer1 = foo.doBusiness(3);
        System.out.println("[ ProxyClient ] answer1 ---> " + answer1);

        // Bar呼び出し。
        System.out.println("[ ProxyClient ] ##### Start Bar #####");
        Bar bar = (Bar)ProxyFactory.getProxy("bar");
        int answer2 = bar.doBusiness(10);
        System.out.println("[ ProxyClient ] answer2 ---> " + answer2);
    }
}