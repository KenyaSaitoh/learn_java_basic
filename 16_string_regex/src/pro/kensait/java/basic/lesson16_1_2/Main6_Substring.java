package pro.kensait.java.basic.lesson16_1_2;

public class Main6_Substring {
    public static void main(String[] args) {
        {
            String str1 = "Foo_Bar_Foobar";
            String str2 = str1.substring(4);
            System.out.println(str2);
        }
        {
            String str1 = "Foo_Bar_Foobar";
            String str2 = str1.substring(4, 7);
            System.out.println(str2);
        }
    }
}