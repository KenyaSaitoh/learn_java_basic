package pro.kensait.designpattern2.bridge;

public class ConcreteImplementor2 extends Implementor {

    public void doTask1() {
        System.out.println("ConcreteImplementor2 : Override Task1 done");
    }

    public void doTask2() {
        System.out.println("ConcreteImplementor2 : Override Task2 done");
    }
}