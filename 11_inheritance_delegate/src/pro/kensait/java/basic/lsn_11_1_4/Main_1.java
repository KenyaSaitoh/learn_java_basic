package pro.kensait.java.basic.lsn_11_1_4;

public class Main_1 {
    public static void main(String[] args) {
        Foo foo = new Qux();
        doSomething(foo);
    }

    static void doSomething(Foo foo) {
        System.out.println("doSomething...");
    }
}