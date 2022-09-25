package pro.kensait.java.basic.lesson19_1_3.throwss;

public class Main {
    public static void main(String[] args) {
        int param = Integer.parseInt(args[0]); // 第1引数をint型に変換
        if (param < 0) {
            throw new IllegalArgumentException("引数が0未満");
        }
        int answer = param * 2;
        System.out.println(answer);
    }
}