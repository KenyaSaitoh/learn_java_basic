package pro.kensait.java.basic.lesson16_1_2;

public class Main10_ValueOf {
    public static void main(String[] args) {
        {
            String str1 = String.valueOf(1234567L);
            System.out.println(str1);
            String str2 = String.valueOf(123.4567);
            System.out.println(str2);
        }
    }
}