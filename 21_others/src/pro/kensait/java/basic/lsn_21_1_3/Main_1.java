package pro.kensait.java.basic.lsn_21_1_3;

public class Main_1 {
	public static void main(String[] args) {
		Foo foo = new Foo(10);
		Foo.Bar bar = foo.getBar();
		System.out.println(bar.getY());
	}
}
