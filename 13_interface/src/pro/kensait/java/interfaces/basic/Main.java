package pro.kensait.java.interfaces.basic;

public class Main {
    public static void main(String[] args) {
        Foo foo1 = new Hoge();
        Foo foo2 = new Piyo();
        foo1.sayYes();
        foo2.sayYes();
    }
}