package pro.kensait.java.basic.lsn_16_1_2;

public class Main5_Index {
    public static void main(String[] args) {
        {
            String str1 = "Foo_Bar_Foobar";
            String str2 = "ar";
            int result = str1.indexOf(str2);
            System.out.println(result);
        }
        {
            String str1 = "Foo_Bar_Foobar";
            String str2 = "ar";
            int result = str1.lastIndexOf(str2);
            System.out.println(result);
        }
    }
}