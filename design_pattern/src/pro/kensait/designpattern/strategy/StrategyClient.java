package pro.kensait.designpattern.strategy;

public class StrategyClient {

    public static void main(String[] args) {

        Strategy strategy1 = new ConcreteStrategy1();
        Context context = new Context(strategy1);
        context.doStrategy1();
        context.doStrategy2();
    }
}