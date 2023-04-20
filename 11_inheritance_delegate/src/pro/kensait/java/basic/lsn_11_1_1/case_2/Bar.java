package pro.kensait.java.basic.lsn_11_1_1.case_2;

public class Bar extends Foo {
    private int y; //【1】
    public Bar(int x, int y) { //【2】
        super(x); //【3】
        this.y = y; //【4】
    }
    public int subtract() {
        return base - getX() - y; //【5】
    }
}