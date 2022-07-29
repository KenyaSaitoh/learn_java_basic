package pro.kensait.designpattern.bridge;

public class BridgeClient {

    public static void main(String[] args) {
        Implementor imple1 = new ConcreteImplementor1();
        Implementor imple2 = new ConcreteImplementor2();
        Abstraction abstraction1 = new RefinedAbstraction(imple1);
        RefinedAbstraction abstraction2 = new RefinedAbstraction(imple2);
        // 
        abstraction1.doTask1();
        abstraction1.doTask2();
        abstraction1.doTask3();
        abstraction1.doTask4();
        // 
        abstraction2.doTask1();
        abstraction2.doTask2();
        abstraction2.doTask3();
        abstraction2.doTask4();
        abstraction2.doTask5();
    }
}