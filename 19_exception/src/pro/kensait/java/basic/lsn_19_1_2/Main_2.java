package pro.kensait.java.basic.lsn_19_1_2;

import java.util.Scanner;

public class Main_2 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        System.out.print("val1? => ");
        int val1 = Integer.parseInt(new Scanner(System.in).nextLine());
        System.out.print("val2? => ");
        int val2 = Integer.parseInt(new Scanner(System.in).nextLine());

        try { //【1】
            int answer = val1 / val2; //【2】除算→例外発生の可能性
            System.out.println(answer);
        } catch (ArithmeticException ae) { //【3】
            System.out.println("ゼロ除算発生, msg => " + ae.getMessage()); //【4】
        }
    }
}