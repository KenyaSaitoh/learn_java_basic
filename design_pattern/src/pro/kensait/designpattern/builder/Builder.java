package pro.kensait.designpattern.builder;

public abstract class Builder {

    public void doTask1() {
        System.out.println("Builder : Object Built");
    }

    public abstract void doTask2();
}