package pro.kensait.java.text;

import java.text.DecimalFormat;

public class NumberFormatMain2 {

    public static void main(String[] args) {
        System.out.println("===== パターン[###,###,##0.00] =====");
        DecimalFormat df1 = new DecimalFormat("###,###,##0.00");
        System.out.println("0012345.67 ---> " + df1.format(0012345.67));
        System.out.println("0 ---> " + df1.format(0));
        System.out.println("-0012345.67 ---> " + df1.format(-0012345.67));
        System.out.println("===== パターン[###,###,##0.00;###,###,##0.00-] =====");
        DecimalFormat df2 = new DecimalFormat("###,###,##0.00;###,###,##0.00-");
        System.out.println("0012345.67 ---> " + df2.format(0012345.67));
        System.out.println("0 ---> " + df2.format(0));
        System.out.println("-0012345.67 ---> " + df2.format(-0012345.67));
        System.out.println("===== パターン[00000] =====");
        DecimalFormat df3 = new DecimalFormat("00000");
        System.out.println("12 ---> " + df3.format(12));
        System.out.println("1234 ---> " + df3.format(1234));
    }
}