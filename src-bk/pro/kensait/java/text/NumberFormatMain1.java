package pro.kensait.java.text;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatMain1 {

    public static void main(String[] args) {
        System.out.println("===== 数値 =====");
        NumberFormat nf1 = NumberFormat.getInstance();
        NumberFormat nf2 = NumberFormat.getInstance(Locale.JAPAN);
        System.out.println("ロケールなし ---> " + nf1.format(12345.67));
        System.out.println("日本 ---> " + nf2.format(12345.67));
        System.out.println("===== 通貨 =====");
        NumberFormat nf3 = NumberFormat.getCurrencyInstance();
        NumberFormat nf4 = NumberFormat.getCurrencyInstance(Locale.JAPAN);
        NumberFormat nf5 = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat nf6 = NumberFormat.getCurrencyInstance(Locale.UK);
        NumberFormat nf7 = NumberFormat.getCurrencyInstance(new Locale("", "IN"));
        System.out.println("ロケールなし ---> " + nf3.format(12345.67));
        System.out.println("日本 ---> " + nf4.format(12345.67));
        System.out.println("USA ---> " + nf5.format(12345.67));
        System.out.println("イギリス ---> " + nf6.format(12345.67));
        System.out.println("インド ---> " + nf7.format(12345.67));
    }
}