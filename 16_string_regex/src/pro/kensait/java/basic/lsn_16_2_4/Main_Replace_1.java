package pro.kensait.java.basic.lsn_16_2_4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main_Replace_1 {
    public static void main(String[] args) {
        {
            System.out.println("***** snippet_1 *****");
            String before = "FooCompany";
            Pattern pattern = Pattern.compile("[a-z]");
            Matcher matcher = pattern.matcher(before);
            String after = matcher.replaceAll("x"); //【1】
            System.out.println(before + " => " + after);
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_2 *****");
            String before = "FooCompany";
            String after = before.replaceAll("[a-z]", "x");
            System.out.println(before + " => " + after);
            System.out.println("=> end");
        }
    }
}