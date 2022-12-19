package pro.kensait.java.basic.lsn_11_1_2.case_2;

import pro.kensait.java.basic.lsn_11_1_2.case_1.Bar;

public class Main {
	public static void main(String[] args) {
        Bar bar = new Bar(30, 10);
        int answer = bar.add();
        System.out.println(answer);
	}
}
