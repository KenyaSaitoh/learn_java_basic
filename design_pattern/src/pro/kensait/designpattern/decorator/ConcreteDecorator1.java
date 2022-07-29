package pro.kensait.designpattern.decorator;

public class ConcreteDecorator1 extends Decorator {

    public ConcreteDecorator1(Component component) {
        super(component);
    }

    public void showMessage() {
        System.out.println("==========");
        component.showMessage();
        System.out.println("==========");
    }
}