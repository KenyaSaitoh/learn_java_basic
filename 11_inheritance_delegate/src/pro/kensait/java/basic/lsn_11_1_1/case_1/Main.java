package pro.kensait.java.basic.lsn_11_1_1.case_1;

public class Main {
	public static void main(String[] args) {
		Bar bar = new Bar();
		bar.x = 30;
		int answer1 = bar.add();
		System.out.println(answer1);

		bar.y = 10;
		int answer2 = bar.subtract();
		System.out.println(answer2);
	}
}
