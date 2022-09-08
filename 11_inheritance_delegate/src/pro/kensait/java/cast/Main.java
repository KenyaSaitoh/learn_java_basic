package pro.kensait.java.cast;

public class Main {
    public static void main(String[] args) {
        Foo foo = new Qux();
        if (foo instanceof Foo) System.out.println("Foo"); // true
        if (foo instanceof Bar) System.out.println("Bar");
        if (foo instanceof Qux) System.out.println("Qux");
        if (foo instanceof Hoge) System.out.println("Hoge");
        doSomething(foo);

        Qux qux = new Qux();
        if (qux instanceof Foo) System.out.println("Foo");
        if (qux instanceof Bar) System.out.println("Bar");
        if (qux instanceof Qux) System.out.println("Qux");
        if (qux instanceof Hoge) System.out.println("Hoge");
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