package pro.kensait.java.basic.lesson21_3_1;

public class Main4_Separator {
    public static void main(String[] args) {
        String separator = System.getProperty("line.separator");
        String message = "こんにちは！" + separator + "私はAlice、25歳です。";
        System.out.println(message);
    }
}