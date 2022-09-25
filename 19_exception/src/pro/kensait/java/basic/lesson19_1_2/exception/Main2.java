package pro.kensait.java.basic.lesson19_1_2.exception;

public class Main2 {
    public static void main(String[] args) {
        int val1 = Integer.parseInt(args[0]); // 第1引数をint型に変換
        int val2 = Integer.parseInt(args[1]); // 第2引数をint型に変換
        try { //［①］
            int answer = val1 / val2; //［②］
            System.out.println(answer);
        } catch (ArithmeticException ae) { //［③］
            System.out.println("ゼロ除算発生, msg => " + ae.getMessage());//［④］
        }
    }
}