package pro.kensait.java.basic.lesson16_1_2;

public class Main3_Compare {
    public static void main(String[] args) {
        {
            String str1 = "Foo_Bar_Foobar";
            String str2 = "foo_bar_fooBAR";
            boolean result = str1.equalsIgnoreCase(str2);
            System.out.println(result);
        }
        {
            String str1 = "foo";
            String str2 = "Foobar";
            int result = str1.compareTo(str2);
            System.out.println(result);
        }
        {
            String str1 = "foo";
            String str2 = "Foobar";
            int result = str1.compareToIgnoreCase(str2);
            System.out.println(result);
        }
    }
}