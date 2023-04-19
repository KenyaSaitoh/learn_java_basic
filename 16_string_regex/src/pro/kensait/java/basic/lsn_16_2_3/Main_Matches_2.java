package pro.kensait.java.basic.lsn_16_2_3;

import java.util.regex.Pattern;

public class Main_Matches_2 {
    public static void main(String[] args) {
        {
            System.out.println("***** snippet_1 *****");
            String str = "FooCompany is the best Company";
            boolean matches = Pattern.matches("^FooCompany.*", str);
            System.out.println("matches => " + matches);
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_2 *****");
            String str = "FooCompany is the best Company";
            boolean matches = str.matches("^FooCompany.*");
            System.out.println("matches => " + matches);
            System.out.println("=> end");
        }
    }
}