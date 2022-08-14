package pro.kensait.java.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMain1 {

    public static void main(String[] args) {
        String str = "ABCDEFGHIJavaXYZ";
        Pattern pattern = Pattern.compile(".*java.*", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(str);
        System.out.println("判定文字列 ---> " + str);
        System.out.println("正規表現 ---> " + pattern.pattern());
        System.out.println("オプション ---> " + pattern.flags());
        System.out.println("マッチしたかどうか ---> " + matcher.matches());
    }
}