package pro.kensait.designpattern2.strategy;

public class ConcreteStrategy2 implements Strategy {

    public void doStrategy1() {
        System.out.println("ConcreteStrategy2 : Strategy1 done");
    }

    public void doStrategy2() {
        System.out.println("ConcreteStrategy2 : Strategy2 done");
    }
}