package pro.kensait.java.inheritance.case02;

public class Bar extends Foo {
    private int y; // 追加
    public Bar(int x, int y) {
        super(x);
        this.y = y;
    }
    public int subtract() { // 追加
        return base - getX() - y;
    }
}