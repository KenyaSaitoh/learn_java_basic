package pro.kensait.designpattern2.decorator;

public class DecoratorClient {

    public static void main(String[] args) {
        //
        Decorator decorator1 = new ConcreteDecorator1(new ConcreteDecorator2(
                new ConcreteComponent("Foo")));
        Decorator decorator2 = new ConcreteDecorator1(new ConcreteDecorator1(
                new ConcreteComponent("Bar")));

        //
        System.out.println("DecoratorClient : Decorator1 call");
        decorator1.showMessage();

        //
        System.out.println("DecoratorClient : Decorator2 call");
        decorator2.showMessage();
    }
}