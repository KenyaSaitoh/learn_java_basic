package pro.kensait.designpattern2.factorymethod;

public class FactoryMethodClient {

    public static void main(String[] args) {
        Creator creator = new ConcreteCreator();
        Product product = creator.getInstance();
        product.doTask1();
        product.doTask2();
    }
}