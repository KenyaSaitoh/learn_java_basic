package pro.kensait.java.basic.lsn_17_1_4;

import java.util.Random;

public class Main2 {
    public static void main(String[] args) {
        {
            System.out.println("***** snippet 17_1_2_1 *****");
            Random random = new Random();
            for (int i = 0; i < 100; i++) {
                int val = random.nextInt(10) + 1;
                System.out.println(val);               
            }
        }
    }
}