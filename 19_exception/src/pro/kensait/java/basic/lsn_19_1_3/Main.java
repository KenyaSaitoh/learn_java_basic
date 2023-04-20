package pro.kensait.java.basic.lsn_19_1_3;

import java.util.Scanner;

public class Main {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        System.out.print("param? => ");
        int param = Integer.parseInt(new Scanner(System.in).nextLine());

        if (param < 0) {
            throw new IllegalArgumentException("引数が0未満"); //【1】
        }
        int answer = param * 2;
        System.out.println(answer);
    }
}