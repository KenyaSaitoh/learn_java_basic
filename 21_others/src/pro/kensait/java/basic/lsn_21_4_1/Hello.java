package pro.kensait.java.basic.lsn_21_4_1;

public class Hello {
    public static void main(String[] args) {
        String name = args[0];
        String age = args[1];
        String message = "こんにちは！私は" + name +  "、" + age + "歳です。";
        System.out.println(message);
    }
}