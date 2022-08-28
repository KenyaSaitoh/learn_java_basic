package pro.kensait.java.nestedclass.member;

public class Main {
	public static void main(String[] args) {
		Foo foo = new Foo(10);
		Foo.Bar bar = foo.getBar();
		System.out.println(bar.getY());
	}
}
