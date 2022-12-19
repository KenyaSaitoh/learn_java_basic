package pro.kensait.java.basic.lsn_21_1_3;

public class Foo {
	private int x;
	public Foo(int x) {
		this.x = x;
	}
	public class Bar { // メンバークラス
		private int y;
		public Bar() {
			this.y = x * 2; // エンクロージングクラスのメンバーにアクセス可能
		}
		public int getY() {
			return y;
		}
	}
	public Bar getBar() {
		return new Bar();
	}
}