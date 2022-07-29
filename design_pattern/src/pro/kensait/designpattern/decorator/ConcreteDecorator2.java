package pro.kensait.designpattern.decorator;

public class ConcreteDecorator2 extends Decorator {

    public ConcreteDecorator2(Component component) {
        super(component);
    }

    public void showMessage() {
        System.out.println("##########");
        component.showMessage();
        System.out.println("##########");
    }
}