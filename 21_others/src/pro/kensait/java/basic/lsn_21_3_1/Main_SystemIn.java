package pro.kensait.java.basic.lsn_21_3_1;

import java.util.Scanner;

public class Main_SystemIn {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //【1】
        String str = scan.nextLine(); //【2】
        System.out.println("取り込んだ文字列 => " + str);
        scan.close();
    }
}