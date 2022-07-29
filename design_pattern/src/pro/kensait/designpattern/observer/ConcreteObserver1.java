package pro.kensait.designpattern.observer;

public class ConcreteObserver1 implements Observer {

    private String name;

    public ConcreteObserver1(String name) {
        this.name = name;
    }

    public void notifyFromSubject() {
        System.out.println("ConcreteObserver1(name = " + name
                + ") : Notify From Subject");
    }
}