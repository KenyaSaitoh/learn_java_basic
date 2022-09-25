package pro.kensait.java.basic.lesson19_1_4.propagation3;

public class Main {
    public static void main(String[] args) {
        Foo foo = new Foo();
        int length = foo.process("foo://"); //［①］
        System.out.println(length); //［②］ 
    }
}