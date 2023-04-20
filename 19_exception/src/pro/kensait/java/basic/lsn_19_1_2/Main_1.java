package pro.kensait.java.basic.lsn_19_1_2;

import java.util.Scanner;

public class Main_1 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        System.out.print("val1? => ");
        int val1 = Integer.parseInt(new Scanner(System.in).nextLine());
        System.out.print("val2? => ");
        int val2 = Integer.parseInt(new Scanner(System.in).nextLine());

        int answer = val1 / val2; //【1】除算→例外発生の可能性
        System.out.println(answer); // 答えを表示
    }
}