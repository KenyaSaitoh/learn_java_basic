package pro.kensait.java.basic.lsn_17_1_3;

import java.text.DecimalFormat;

public class Main_DecimalFormat1 {
    public static void main(String[] args) throws Exception {
        DecimalFormat df = new DecimalFormat("000000000");
        String str1 = df.format(12345);
        System.out.println(str1);

        String str2 = "000012345";
        Integer val = df.parse(str2).intValue();
        System.out.println(val);
    }
}