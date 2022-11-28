package pro.kensait.java.basic.lesson15_2_2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMain1 {
    public static void main(String[] args) {
        //String str = "ABCDEFGHIJavaXYZ";
        // String str = "FooCompany is the best Company";
        String str = "FooCompany FooCompany FooCompany";
        // String str = "The best Company is FooCompany";
        //Pattern pattern = Pattern.compile(".*java.*", Pattern.CASE_INSENSITIVE);
        Pattern pattern = Pattern.compile("FooCompany");
        Matcher matcher = pattern.matcher(str);
        System.out.println("判定文字列 => " + str);
        System.out.println("正規表現 => " + pattern.pattern());
        System.out.println("オプション => " + pattern.flags());
        System.out.println("lookingAt => " + matcher.lookingAt());
        System.out.println("matches => " + matcher.matches());
        System.out.println(matcher.find());
        System.out.println(matcher.find());
        System.out.println(matcher.find());
        System.out.println(matcher.find());
    }
}