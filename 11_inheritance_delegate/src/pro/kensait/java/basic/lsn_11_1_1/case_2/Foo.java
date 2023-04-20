package pro.kensait.java.basic.lsn_11_1_1.case_2;

public class Foo {
    public int base = 100;
    private int x; //【1】
    public Foo(int x) { //【2】
        this.x = x;
    }
    public int getX() {
        return x;
    }
    public int add() {
        return base + x;
    }
}