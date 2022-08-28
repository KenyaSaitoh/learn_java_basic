package pro.kensait.java.inheritance.case21;

public class Bar extends Foo {
    public int base = 200; // 上書き
    public int y; // 追加
	public int subtract() { // 追加
		return base - x - y;
	}
//	@Override
//	public int add() { // 上書き
//		System.out.println(super.base + "#" + this.base);
//
//		int tmp = super.add();
//		// return tmp + y; // 140
//
//		return base + x + y; // 240
//		// return super.base + x + y; // 140
//	}
	public int add(int z) { // これは上書きではない
		return base + x + y + z;
	}
}