package pro.kensait.java.inheritance.case2;

public class Main {
	public static void main(String[] args) {
		Bar bar = new Bar(30, 10);
		int answer = bar.subtract();
		System.out.println(answer);
	}
}
