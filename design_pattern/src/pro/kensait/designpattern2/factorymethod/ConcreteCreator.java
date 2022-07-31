package pro.kensait.designpattern2.factorymethod;

public class ConcreteCreator extends Creator {

    public Product getInstance() {
        return new ConcreteProduct();
    }
}