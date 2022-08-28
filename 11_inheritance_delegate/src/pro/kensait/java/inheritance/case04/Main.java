package pro.kensait.java.inheritance.case04;

import pro.kensait.java.inheritance.case03.Bar;

public class Main {
	public static void main(String[] args) {
        Bar bar = new Bar(30, 10);
        int answer = bar.add();
        System.out.println(answer);
	}
}
