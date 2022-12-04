package pro.kensait.java.basic.lesson17_1_3;

import java.text.NumberFormat;
import java.text.ParseException;

public class Main_NumberFormat2 {
    public static void main(String[] args) {
        String str1 = "1,000,000";
        NumberFormat nf = NumberFormat.getIntegerInstance();
        try {
            Integer val = nf.parse(str1).intValue();
            System.out.println(val);
        } catch (ParseException pe) {
            new RuntimeException(pe);
        }
    }
}