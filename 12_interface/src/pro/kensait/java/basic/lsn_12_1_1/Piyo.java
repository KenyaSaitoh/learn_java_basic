package pro.kensait.java.basic.lsn_12_1_1;

public class Piyo implements Foo, Bar {
    @Override
    public void sayYes() { //【2】
        System.out.println("Piyo says YES!");
    }

    @Override
    public void sayHello() { //【3】
        System.out.println("Piyo says Hello!");
    }

    @Override
    public void sayGoodbye() { //【4】
        System.out.println("Piyo says Goodbye!");
    }
    
    public void sayGoodnight() { //【5】
        System.out.println("Piyo says Goodnight!");
    }
}