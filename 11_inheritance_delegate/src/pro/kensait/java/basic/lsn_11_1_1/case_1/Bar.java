package pro.kensait.java.basic.lsn_11_1_1.case_1;

public class Bar extends Foo {
    public int y; // 追加
	public int subtract() { // 追加
		return base - x - y;
	}
}