package pro.kensait.java.basic.lsn_16_2_3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main_Matches_1 {
    public static void main(String[] args) {
        {
            System.out.println("***** snippet_1 *****");
            String str = "FooCompany is the best Company"; //【1】
            Pattern pattern = Pattern.compile("^FooCompany.*"); //【2】
            Matcher matcher = pattern.matcher(str); //【3】
            boolean matches = matcher.matches(); //【4】true
            boolean lookingAt = matcher.lookingAt(); //【5】true
            String group = matcher.group(); //【6】"FooCompany"
            System.out.println("matches => " + matches);
            System.out.println("lookingAt => " + lookingAt);
            System.out.println("group => " + group);
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_2 *****");
            String str = "FooCompany is the best Company";
            Pattern pattern = Pattern.compile("FooCompany");
            Matcher matcher = pattern.matcher(str);
            boolean matches = matcher.matches();
            boolean lookingAt = matcher.lookingAt();
            String group = matcher.group();
            System.out.println("matches => " + matches);
            System.out.println("lookingAt => " + lookingAt);
            System.out.println("group => " + group);
            System.out.println("=> end");
        }
    }
}