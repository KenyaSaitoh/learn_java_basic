package pro.kensait.pkg2;

import pro.kensait.pkg1.Foo;

public class Bar {
	public static void main(String[] args) {
		Foo foo = new Foo(10); // ①OK
//		int val1 = foo.x; // ②NG
		int val2 = foo.getX(); // ③OK
//		int val3 = foo.pow(); // ④NG
	}
}
