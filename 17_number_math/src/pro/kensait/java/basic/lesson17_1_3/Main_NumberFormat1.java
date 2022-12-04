package pro.kensait.java.basic.lesson17_1_3;

import java.text.NumberFormat;

public class Main_NumberFormat1 {
    public static void main(String[] args) {
        NumberFormat nf1 = NumberFormat.getIntegerInstance();
        NumberFormat nf2 = NumberFormat.getCurrencyInstance();
        NumberFormat nf3 = NumberFormat.getPercentInstance();
        nf3.setMaximumFractionDigits(5);
        String val1 = nf1.format(1000000);
        String val2 = nf2.format(1000000);
        String val3 = nf3.format(0.1234);
        System.out.println(val1);
        System.out.println(val2);
        System.out.println(val3);
    }
}