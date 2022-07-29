package pro.kensait.designpattern.observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class Subject {

    private List<Observer> observers = new ArrayList<Observer>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers() {
        Iterator<Observer> iterator = observers.iterator();
        while (iterator.hasNext()) {
            Observer observer = iterator.next();
            System.out.println("Subject : Notify To Observer");
            observer.notifyFromSubject();
        }
    }

    public abstract void doTask();
}