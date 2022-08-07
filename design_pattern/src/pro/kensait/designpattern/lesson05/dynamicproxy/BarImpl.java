package pro.kensait.designpattern.lesson05.dynamicproxy;

public class BarImpl implements Bar {
    //
    public int doBusiness(int param) {
        System.out.println("[ BarImpl#doBusiness ] Start");
        System.out.println("[ BarImpl#doBusiness ] param ---> " + param);
        System.out.println("[ BarImpl#doBusiness ] End");
        return param * param;
    }
}