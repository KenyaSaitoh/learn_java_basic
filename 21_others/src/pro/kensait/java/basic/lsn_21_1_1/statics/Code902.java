package pro.kensait.java.basic.lsn_21_1_1.statics;

import pro.kensait.java.basic.lsn_21_1_1.statics.OuterClass1.StaticInnnerClass;

public class Code902 {
	public static void main(String[] args) {
		StaticInnnerClass s = new StaticInnnerClass(10, 20);
		System.out.println(s);
		s.foo();
	}
}
