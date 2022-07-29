package pro.kensait.designpattern.strategy;

public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void doStrategy1() {
        System.out.println("Context : Strategy1 call");
        strategy.doStrategy1();
    }

    public void doStrategy2() {
        System.out.println("Context : Strategy2 call");
        strategy.doStrategy2();
    }
}