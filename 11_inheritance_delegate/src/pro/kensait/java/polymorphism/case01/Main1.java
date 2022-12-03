package pro.kensait.java.polymorphism.case01;

public class Main1 {
    public static void main(String[] args) {
        Foo foo1 = new Bar();
        Foo foo2 = new Baz();
        foo1.doSomething(); // "これはBarです"と表示される
        foo2.doSomething(); // "これはBazです"と表示される
    }
}