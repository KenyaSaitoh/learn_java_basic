package pro.kensait.java.basic.lesson19_1_4.propagation2;

public class Main {
    public static void main(String[] args) {
        Foo foo = new Foo();
        int length = foo.process(args[0]); //［1］
        System.out.println(length); //［2］ 
    }
}