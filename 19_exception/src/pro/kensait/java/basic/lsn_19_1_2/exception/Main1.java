package pro.kensait.java.basic.lsn_19_1_2.exception;

public class Main1 {
    public static void main(String[] args) {
        int val1 = Integer.parseInt(args[0]); // 第1引数をint型に変換
        int val2 = Integer.parseInt(args[1]); // 第2引数をint型に変換
        int answer = val1 / val2; // 除算［1］
        System.out.println(answer); // 答えを表示
    }
}