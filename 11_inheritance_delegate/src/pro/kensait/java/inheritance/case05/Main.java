package pro.kensait.java.inheritance.case05;

import pro.kensait.java.inheritance.case03.Bar;

public class Main {
	public static void main(String[] args) {
        Bar bar = new Bar(30, 10);
		int answer1 = bar.add();
		System.out.println(answer1);

		int answer2 = bar.subtract();
		System.out.println(answer2);
	}
}
