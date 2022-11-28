package pro.kensait.java.basic.lesson15_2_2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMain4 {

    public static void main(String[] args) {
        String before = "FooCommany the best Company.";
        Pattern pattern = Pattern.compile("\\.");
        Matcher matcher = pattern.matcher(before);
        String after = matcher.replaceAll("!");
        System.out.println(before + " ---> " + after);
    }
}