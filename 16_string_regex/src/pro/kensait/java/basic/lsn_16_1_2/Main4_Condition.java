package pro.kensait.java.basic.lsn_16_1_2;

public class Main4_Condition {
    public static void main(String[] args) {
        {
            String str1 = "Foo_Bar_Foobar";
            String str2 = "Bar";
            boolean result = str1.contains(str2);
            System.out.println(result);
        }
        {
            String str1 = "Foo_Bar_Foobar";
            String str2 = "Foo";
            boolean result = str1.startsWith(str2);
            System.out.println(result);
        }
        {
            String str1 = "Foo_Bar_Foobar";
            String str2 = "bar";
            boolean result = str1.endsWith(str2);
            System.out.println(result);
        }
        {
            String str1 = "";
            boolean result = str1.isEmpty();
            System.out.println(result);
        }
        {
            String str1 = "   ";
            boolean result = str1.isBlank();
            System.out.println(result);
        }
    }
}