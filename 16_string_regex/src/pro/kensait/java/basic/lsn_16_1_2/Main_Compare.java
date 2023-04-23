package pro.kensait.java.basic.lsn_16_1_2;

public class Main_Compare {
    public static void main(String[] args) {
        {
            System.out.println("***** snippet_1 *****");
            String str1 = "Foo_Bar_Foobar";
            String str2 = "foo_bar_fooBAR";
            boolean result = str1.equalsIgnoreCase(str2);
            System.out.println(result);
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_2 *****");
            String str1 = "foo";
            String str2 = "bar";
            int result = str1.compareTo(str2);
            System.out.println(0 < result);
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_3 *****");
            String str1 = "foo";
            String str2 = "Foo";
            int result = str1.compareToIgnoreCase(str2); // 0
            System.out.println(0 == result);
            System.out.println("=> end");
        }
    }
}