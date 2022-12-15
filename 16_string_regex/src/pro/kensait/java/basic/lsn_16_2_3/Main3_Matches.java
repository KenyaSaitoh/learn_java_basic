package pro.kensait.java.basic.lsn_16_2_3;

import java.util.regex.Pattern;

public class Main3_Matches {
    public static void main(String[] args) {
        {
            String str = "FooCompany is the best Company";
            boolean matches = Pattern.matches("^FooCompany.*", str);
            System.out.println("matches => " + matches);
        }
        {
            String str = "FooCompany is the best Company";
            boolean matches = str.matches("^FooCompany.*");
            System.out.println("matches => " + matches);
        }
    }
}