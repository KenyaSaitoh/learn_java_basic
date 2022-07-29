package pro.kensait.designpattern.factorymethod;

public abstract class Product {

    public void doTask1() {
        System.out.println("Product : Task done");
    }

    public abstract void doTask2();
}