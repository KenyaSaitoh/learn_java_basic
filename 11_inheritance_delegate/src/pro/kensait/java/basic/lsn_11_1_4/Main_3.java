package pro.kensait.java.basic.lsn_11_1_4;

public class Main_3 {
    public static void main(String[] args) {
        Foo foo = new Qux();
        if (foo instanceof Foo) System.out.println("Foo"); // true
        if (foo instanceof Bar) System.out.println("Bar"); // true
        if (foo instanceof Baz) System.out.println("Baz"); // false
        if (foo instanceof Qux) System.out.println("Qux"); // true
        if (foo instanceof Hoge) System.out.println("Hoge"); // false
    }
}