package pro.kensait.java.nestedclass.stc;

import pro.kensait.java.nestedclass.stc.OuterClass1.StaticInnnerClass;

public class Code902 {
	public static void main(String[] args) {
		StaticInnnerClass s = new StaticInnnerClass(10, 20);
		System.out.println(s);
		s.foo();
	}
}
