package pro.kensait.java.exception;

public class ExceptionThrowMain1 {

    public static void main(String[] args) {
        int value1 = 10, value2 = 0, answer = 0;
        try {
            System.out.println("===== Before =====");
            answer = calc(value1, value2);
            System.out.println("===== After =====");
            System.out.println("answer ---> " + answer);
        } catch (ArithmeticException ae) {
            System.out.println("===== main内の例外処理 =====");
            System.out.println("Exception : " + ae);
        }
    }

    public static int calc(int value1, int value2) {
        int answer;
        try {
            answer = value1 / value2;
        } catch (ArithmeticException e) {
            System.out.println("===== calc内の例外処理 =====");
            System.out.println("Exception : " + e);
            throw e;
        }
        return answer;
    }
}