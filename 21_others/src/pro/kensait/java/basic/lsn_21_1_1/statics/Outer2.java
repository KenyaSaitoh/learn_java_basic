package pro.kensait.java.basic.lsn_21_1_1.statics;

public class Outer2 {
	public class Inner {
		int x, y;
		public Inner(int x, int y) {
			this.x = x;
			this.y = y;
		}
		public void foo() {
			System.out.println(x);
		}
	}
	
	Inner get() {
		return new Inner(10, 20);
	}
}
