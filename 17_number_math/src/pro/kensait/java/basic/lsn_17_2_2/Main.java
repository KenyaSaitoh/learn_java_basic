package pro.kensait.java.basic.lsn_17_2_2;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;

public class Main {
    public static void main(String[] args) {
        {
            System.out.println("***** snippet_1 *****");
            NumberFormat nf1 = NumberFormat.getIntegerInstance(); //【1】
            NumberFormat nf2 = NumberFormat.getCurrencyInstance(); //【2】
            NumberFormat nf3 = NumberFormat.getPercentInstance(); //【3】
            nf3.setMaximumFractionDigits(5); //【4】
            String val1 = nf1.format(1000000); // "1,000,000"
            String val2 = nf2.format(1000000); // "￥1,000,000"
            String val3 = nf3.format(0.1234); // "12.34%"
            System.out.println(val1);
            System.out.println(val2);
            System.out.println(val3);
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_2 *****");
            String str1 = "1,000,000";
            NumberFormat nf = NumberFormat.getIntegerInstance(); //【1】
            try {
                Integer val = nf.parse(str1).intValue(); //【2】
                System.out.println(val);
            } catch (ParseException pe) {
                new RuntimeException(pe);
            }
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_3 *****");
            DecimalFormat df = new DecimalFormat("000000000"); //【1】
            String str = df.format(12345); //【2】
            System.out.println(str);
            try {
                Integer val = df.parse(str).intValue(); //【3】
                System.out.println(val);
            } catch (ParseException pe) {
                new RuntimeException(pe);
            }
            System.out.println("=> end");
        }
    }
}