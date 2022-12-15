package pro.kensait.java.basic.lsn_19_1_2.exception;

public class Main2 {
    public static void main(String[] args) {
        int val1 = Integer.parseInt(args[0]); // 第1引数をint型に変換
        int val2 = Integer.parseInt(args[1]); // 第2引数をint型に変換
        try { //［1］
            int answer = val1 / val2; //［2］
            System.out.println(answer);
        } catch (ArithmeticException ae) { //［3］
            System.out.println("ゼロ除算発生, msg => " + ae.getMessage());//［4］
        }
    }
}