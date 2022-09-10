package pro.kensait.java.object.equivalence;

public class Main1 {
    public static void main(String[] args) {
        Foo foo1 = new Foo();
        Foo foo2 = new Foo();
        boolean b1 = foo1 == foo2; // falseになる［①］
        Foo foo3 = foo1; //［②］
        boolean b2 = foo1 == foo3; // trueになる［③］
        System.out.println(b1 + ", " + b2);
    }
}
