package pro.kensait.java.basic.lsn_21_3_4;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        {
            System.out.println("***** snippet_1 *****");
            String str1 = "foo";
            String str2 = "foo";
            System.out.println(Objects.equals(str1, str2));
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_2 *****");
            Integer val1 = 100;
            Long val2 = 100L;
            System.out.println(Objects.equals(val1, val2));
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_3 *****");
            Object o1 = null;
            Object o2 = null;
            System.out.println(Objects.equals(o1, o2));
            System.out.println("=> end");
        }
    }
}