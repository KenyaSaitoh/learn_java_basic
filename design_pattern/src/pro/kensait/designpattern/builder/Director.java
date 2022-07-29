package pro.kensait.designpattern.builder;

public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.doTask1();
        builder.doTask2();
    }
}