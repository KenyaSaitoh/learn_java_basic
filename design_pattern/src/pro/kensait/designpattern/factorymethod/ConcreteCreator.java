package pro.kensait.designpattern.factorymethod;

public class ConcreteCreator extends Creator {

    public Product getInstance() {
        return new ConcreteProduct();
    }
}