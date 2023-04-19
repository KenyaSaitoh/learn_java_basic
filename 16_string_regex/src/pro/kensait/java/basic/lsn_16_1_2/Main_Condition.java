package pro.kensait.java.basic.lsn_16_1_2;

public class Main_Condition {
    public static void main(String[] args) {
        {
            System.out.println("***** snippet_1 *****");
            String str1 = "Foo_Bar_Foobar";
            String str2 = "Bar";
            boolean result = str1.contains(str2);
            System.out.println(result);
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_2 *****");
            String str1 = "Foo_Bar_Foobar";
            String str2 = "Foo";
            boolean result = str1.startsWith(str2);
            System.out.println(result);
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_3 *****");
            String str1 = "Foo_Bar_Foobar";
            String str2 = "bar";
            boolean result = str1.endsWith(str2);
            System.out.println(result);
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_4 *****");
            String str = "";
            boolean result = str.isEmpty();
            System.out.println(result);
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_5 *****");
            String str = "   ";
            boolean result = str.isBlank();
            System.out.println(result);
            System.out.println("=> end");
        }
    }
}