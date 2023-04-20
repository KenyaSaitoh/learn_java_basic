package pro.kensait.java.basic.lsn_16_2_3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main_Find {
    public static void main(String[] args) {
        String str = "FooCompany is better than BarCompany"; //【1】
        Pattern pattern = Pattern.compile("([A-Z].*?)Company"); //【2】
        Matcher matcher = pattern.matcher(str); //【3】
        boolean find1 = matcher.find(); //【4】true
        String group1 = matcher.group(); //【5】"FooCompany"
        boolean find2 = matcher.find(); //【6】true
        String group2 = matcher.group(); //【7】"BarCompany"
        boolean find3 = matcher.find(); //【8】false
        System.out.println(find1);
        System.out.println(group1);
        System.out.println(find2);
        System.out.println(group2);
        System.out.println(find3);
    }
}