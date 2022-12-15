package pro.kensait.java.basic.lsn_16_1_2;

public class Main2_Conversion {
    public static void main(String[] args) {
        {
            String str1 = "Foo_Bar_Foobar";
            String str2 = str1.toUpperCase();
            System.out.println(str2);
        }
        {
            String str1 = "Foo_Bar_Foobar";
            String str2 = str1.toLowerCase();
            System.out.println(str2);
        }
        {
            String str1 = "Foo_Bar_Foobar";
            String str2 = "@mail.kensait.pro";
            String str3 = str1.concat(str2);
            System.out.println(str3);
        }

        {
            String str1 = " Foo Bar Foobar   ";
            String str2 = str1.trim();
            System.out.println("#" + str2 + "#");
        }
    }
}