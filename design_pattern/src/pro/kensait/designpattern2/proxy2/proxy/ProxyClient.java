package pro.kensait.designpattern2.proxy2.proxy;

public class ProxyClient {

    public static void main(String[] args) {
        Foo foo = new FooProxy();
        int answer = foo.doBusiness(3);
        System.out.println("answer ---> " + answer);
    }
}