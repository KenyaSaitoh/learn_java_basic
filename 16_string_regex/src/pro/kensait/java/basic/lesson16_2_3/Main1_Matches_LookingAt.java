package pro.kensait.java.basic.lesson16_2_3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main1_Matches_LookingAt {
    public static void main(String[] args) {
        {
            String str = "FooCompany is the best Company";
            Pattern pattern = Pattern.compile("^FooCompany.*");
            Matcher matcher = pattern.matcher(str);
            boolean matches = matcher.matches();
            boolean lookingAt = matcher.lookingAt();
            String group = matcher.group();
            System.out.println("matches => " + matches);
            System.out.println("lookingAt => " + lookingAt);
            System.out.println("group => " + group);
        }
        {
            String str = "FooCompany is the best Company";
            Pattern pattern = Pattern.compile("FooCompany");
            Matcher matcher = pattern.matcher(str);
            boolean matches = matcher.matches();
            boolean lookingAt = matcher.lookingAt();
            String group = matcher.group();
            System.out.println("matches => " + matches);
            System.out.println("lookingAt => " + lookingAt);
            System.out.println("group => " + group);
        }
    }
}