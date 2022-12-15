package pro.kensait.java.basic.lsn_11_1_5;

public class Main_1 {
    public static void main(String[] args) {
        Foo foo1 = new Bar();
        Foo foo2 = new Baz();
        foo1.doSomething(); // "これはBarです"と表示される
        foo2.doSomething(); // "これはBazです"と表示される
    }
}