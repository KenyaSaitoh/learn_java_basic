package pro.kensait.java.basic.lsn_11_1_1.case2;

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