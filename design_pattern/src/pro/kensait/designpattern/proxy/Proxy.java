package pro.kensait.designpattern.proxy;

public class Proxy implements Subject {

    private RealSubject realSubject;

    public void doTask1() {
        System.out.println("Proxy : Task1 done");
    }

    public void doTask2() {
        System.out.println("Proxy : Task2 done");
    }

    public void doTask3() {
        System.out.println("Proxy : Task3 done");
        System.out.println("Proxy : RealSubject created");
        this.realSubject = new RealSubject();
        realSubject.doTask3();
    }
}