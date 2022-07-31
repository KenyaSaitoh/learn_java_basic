package pro.kensait.designpattern2.strategy;

public class ConcreteStrategy1 implements Strategy {

    public void doStrategy1() {
        System.out.println("ConcreteStrategy1 : Strategy1 done");
    }

    public void doStrategy2() {
        System.out.println("ConcreteStrategy1 : Strategy2 done");
    }
}