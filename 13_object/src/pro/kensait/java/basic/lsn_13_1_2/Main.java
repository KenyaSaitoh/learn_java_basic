package pro.kensait.java.basic.lsn_13_1_2;

public class Main {
    public static void main(String[] args) {
        Foo foo1 = new Foo();
        Foo foo2 = new Foo();
        boolean flag1 = foo1 == foo2; // falseになる
        Foo foo3 = foo1;
        boolean flag2 = foo1 == foo3; // trueになる
        System.out.println(flag1 + ", " + flag2);
    }
}
