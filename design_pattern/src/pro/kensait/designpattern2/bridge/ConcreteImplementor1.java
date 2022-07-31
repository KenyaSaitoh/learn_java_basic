package pro.kensait.designpattern2.bridge;

public class ConcreteImplementor1 extends Implementor {

    public void doTask1() {
        System.out.println("ConcreteImplementor1 : Override Task1 done");
    }

    public void doTask2() {
        System.out.println("ConcreteImplementor1 : Override Task2 done");
    }
}