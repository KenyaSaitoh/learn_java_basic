package pro.kensait.java.inheritance.case04;

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
		int tmp = super.add();
		return tmp + y; // 140
	}
}