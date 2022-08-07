package pro.kensait.designpattern.lesson05.dynamicproxy;

public class FooImpl implements Foo {
    //
    public int doBusiness(int param) {
        System.out.println("[ FooImpl#doBusiness ] Start");
        System.out.println("[ FooImpl#doBusiness ] param ---> " + param);
        System.out.println("[ FooImpl#doBusiness ] End");
        return param + param;
    }
}