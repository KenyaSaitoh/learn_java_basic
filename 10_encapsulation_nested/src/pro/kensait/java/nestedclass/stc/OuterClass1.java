package pro.kensait.java.nestedclass.stc;

public class OuterClass1 {
	@Override
	public String toString() {
		return "OuterClass1 [x=" + x + ", y=" + y + "]";
	}

	int x, y;
	
	public OuterClass1(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public static class StaticInnnerClass {
		int x, y;

		public StaticInnnerClass(int x, int y) {
			super();
			this.x = x;
			this.y = y;
		}

		public void foo() {
			OuterClass1 o = new OuterClass1(40, 20);
			System.out.println(o);
		}
		
		@Override
		public String toString() {
			return "StaticInnnerClass [x=" + x + ", y=" + y + "]";
		}
		
	}
}
