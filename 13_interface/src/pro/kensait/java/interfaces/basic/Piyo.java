package pro.kensait.java.interfaces.basic;

public class Piyo implements Foo, Bar {
    @Override
    public void sayYes() {
        System.out.println("Piyo says YES!");
    }

    @Override
    public void sayHello() {
        System.out.println("Piyo says Hello!");
    }

    @Override
    public void sayGoodbye() {
        System.out.println("Piyo says Goodbye!");
    }
    
    public void sayGoodnight() {
        System.out.println("Piyo says Goodnight!");
    }
}