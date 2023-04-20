package pro.kensait.java.basic.lsn_17_2_3;

import java.util.Random;

public class Main_Random {
    public static void main(String[] args) {
        Random random = new Random(); //【1】
        for (int i = 0; i < 100; i++) {
            int val = random.nextInt(10) + 1; //【2】
            System.out.println(val);
        }
    }
}