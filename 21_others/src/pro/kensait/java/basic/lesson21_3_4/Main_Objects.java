package pro.kensait.java.basic.lesson21_3_4;

import java.util.Objects;

public class Main_Objects {
    public static void main(String[] args) {
        String str1 = "foo";
        String str2 = "foo1";
        Integer val1 = 100;
        Long val2 = 100L;
        Object o1 = null;
        Object o2 = null;
        System.out.println(Objects.equals(str1, str2));
        System.out.println(Objects.equals(val1, val2));
        System.out.println(Objects.equals(o1, o2));
        System.out.println(Objects.equals(o1, val1));
    }
}