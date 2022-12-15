package pro.kensait.java.basic.lsn_16_2_4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main1_Replace {
    public static void main(String[] args) {
        String before = "FooCompany";
        Pattern pattern = Pattern.compile("[a-z]");
        Matcher matcher = pattern.matcher(before);
        String after = matcher.replaceAll("x");
        System.out.println(before + " => " + after);
    }
}