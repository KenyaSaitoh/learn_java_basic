package pro.kensait.java.basic.lsn_21_3_3;

import java.text.NumberFormat;
import java.util.Locale;

public class Main_NumberFormat_Locale {
    public static void main(String[] args) {
        NumberFormat nf1 = NumberFormat.getCurrencyInstance();
        NumberFormat nf2 = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat nf3 = NumberFormat.getCurrencyInstance(Locale.UK);
        String str1 = nf1.format(10000);
        String str2 = nf2.format(10000);
        String str3 = nf3.format(10000);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
}