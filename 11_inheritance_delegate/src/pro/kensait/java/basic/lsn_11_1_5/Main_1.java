package pro.kensait.java.basic.lsn_11_1_5;

public class Main_1 {
    public static void main(String[] args) {
        Foo foo1 = new Bar(); //【1】
        Foo foo2 = new Baz(); //【2】
        foo1.doSomething(); // 【3】"これはBarです"と表示される
        foo2.doSomething(); // 【4】"これはBazです"と表示される
    }
}