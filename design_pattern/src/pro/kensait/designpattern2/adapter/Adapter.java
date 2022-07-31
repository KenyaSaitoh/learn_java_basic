package pro.kensait.designpattern2.adapter;

public class Adapter implements Target {

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    public void doTask1() {
        System.out.println("Adapter : Task1 done");
        adaptee.doTask1();
    }

    public void doTask2() {
        System.out.println("Adapter : Task2 done");
        adaptee.doTask2();
    }
}