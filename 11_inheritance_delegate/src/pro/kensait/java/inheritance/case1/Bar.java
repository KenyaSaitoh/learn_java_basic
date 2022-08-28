package pro.kensait.java.inheritance.case1;

public class Bar extends Foo {
    public int y; // 追加
	public int subtract() { // 追加
		return base - x - y;
	}
}