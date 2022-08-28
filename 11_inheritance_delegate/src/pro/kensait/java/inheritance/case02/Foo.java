package pro.kensait.java.inheritance.case02;

public class Foo {
    public int base = 100;
    private int x;
    public Foo(int x) {
        this.x = x;
    }
    public int getX() {
        return x;
    }
    public int add() {
        return base + x;
    }
}