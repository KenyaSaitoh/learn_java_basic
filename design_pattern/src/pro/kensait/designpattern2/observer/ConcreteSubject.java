package pro.kensait.designpattern2.observer;

public class ConcreteSubject extends Subject {

    public void doTask() {
        System.out.println("ConcreteSubject : start");
        notifyObservers();
    }
}