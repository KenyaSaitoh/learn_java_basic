package pro.kensait.designpattern2.bridge;

public class Abstraction {

    private Implementor implementor;

    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    public void doTask1() {
        implementor.doTask1();
    }

    public void doTask2() {
        implementor.doTask2();
    }

    public void doTask3() {
        System.out.println("Abstraction : Task3 done");
    }

    public void doTask4() {
        System.out.println("Abstraction : Task4 done");
    }
}