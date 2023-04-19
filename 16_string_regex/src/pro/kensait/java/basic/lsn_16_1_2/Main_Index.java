package pro.kensait.java.basic.lsn_16_1_2;

public class Main_Index {
    public static void main(String[] args) {
        {
            System.out.println("***** snippet_1 *****");
            String str1 = "Foo_Bar_Foobar";
            String str2 = "ar";
            int result = str1.indexOf(str2);
            System.out.println(result);
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_2 *****");
            String str1 = "Foo_Bar_Foobar";
            String str2 = "ar";
            int result = str1.lastIndexOf(str2);
            System.out.println(result);
            System.out.println("=> end");
        }
    }
}