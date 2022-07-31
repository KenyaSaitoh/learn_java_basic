package pro.kensait.designpattern2.observer;

public class ObserverClient {

    public static void main(String[] args) {

        // 
        Subject subject = new ConcreteSubject();
        Observer observer1 = new ConcreteObserver1("Foo");
        subject.addObserver(observer1);
        Observer observer2 = new ConcreteObserver1("Bar");
        subject.addObserver(observer2);
        Observer observer3 = new ConcreteObserver2("Baz");
        subject.addObserver(observer3);

        //
        subject.doTask();
    }
}