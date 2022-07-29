package pro.kensait.designpattern.observer;

public class ConcreteObserver2 implements Observer {

    private String name;

    public ConcreteObserver2(String name) {
        this.name = name;
    }

    public void notifyFromSubject() {
        System.out.println("ConcreteObserver2(name = " + name
                + ") : Notify From Subject");
    }
}