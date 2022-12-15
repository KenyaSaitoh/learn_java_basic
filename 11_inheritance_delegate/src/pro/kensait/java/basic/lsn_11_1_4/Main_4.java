package pro.kensait.java.basic.lsn_11_1_4;

public class Main_4 {
    public static void main(String[] args) {
        Foo foo = new Qux();
        doSomething(foo);
        doSomething2(foo);
    }

    static void doSomething(Foo foo) {
        if (foo instanceof Qux) {
            Qux qux = (Qux) foo;
            System.out.println("OK");
        }
    }

    static void doSomething2(Foo foo) {
        if (foo instanceof Qux qux) {
            System.out.println("OK");
        }
    }
}