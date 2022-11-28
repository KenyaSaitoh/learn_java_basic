package pro.kensait.java.basic.lesson16_1_2;

public class Main9_Formatting {
    public static void main(String[] args) {
        {
            String str1 = String.format("私は%s、%d歳です。", "Alice", 25);
            System.out.println(str1);
            String str2 = String.format("彼女は%1$sです。%1$sは%2$d歳です。", "Alice", 25);
            System.out.println(str2);
            String str3 = String.format("私は%-7s、%05d歳です。", "Alice", 25);
            System.out.println(str3);
            String str4 = String.format("私の身長は、%.2fcmです。", 165.5);
            System.out.println(str4);
        }
    }
}