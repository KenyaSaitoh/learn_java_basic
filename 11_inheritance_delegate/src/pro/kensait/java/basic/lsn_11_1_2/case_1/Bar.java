package pro.kensait.java.basic.lsn_11_1_2.case_1;

public class Bar extends Foo {
    public int y; // 追加
    public Bar(int x, int y) {
        super(x);
        this.y = y;
    }
    public int subtract() { // 追加
        return base - getX() - y;
    }
    @Override
    public int add() { // オーバーライド
        return base + getX() + y;
    }
}