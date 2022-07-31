package pro.kensait.designpattern2.builder;

public abstract class Builder {

    public void doTask1() {
        System.out.println("Builder : Object Built");
    }

    public abstract void doTask2();
}