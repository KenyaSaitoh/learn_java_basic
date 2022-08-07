package pro.kensait.designpattern2.proxy2.proxy;

public class FooProxy implements Foo {

    private FooImpl foo;

    public int doBusiness(int param) {
        System.out.println("[ FooProxy#doBusiness ] Start");
        foo = new FooImpl();
        int answer = foo.doBusiness(param);
        System.out.println("[ FooProxy#doBusiness ] End");
        return answer;
    }
}