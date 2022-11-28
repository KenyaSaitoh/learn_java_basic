package pro.kensait.java.basic.lesson16_1_2;

public class Main8_Replace {
    public static void main(String[] args) {
        {
            String str1 = "Foo_Bar_Foobar";
            String str2 = str1.replace("Foo", "Hoge");
            System.out.println(str2);
        }
    }
}