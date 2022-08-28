package pro.kensait.java.inheritance.case2;

public class Bar extends Foo {
    private int y; // 追加

    /*
    public Bar(int x) {
        super(x);
    }
    */

    // もし、引数のないコンストラクタがFooにない場合は、このコンストラクタがないとコンパイルエラー
    public Bar(int x, int y) {
        super(x);
        this.y = y;
    }

    public int subtract() { // 追加
        return base - getX() - y;
    }
}
