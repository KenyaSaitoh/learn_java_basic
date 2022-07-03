package pro.kensait.java.exception;

public class ExceptionMain2 {

    public static void main(String[] args) {
        int value1 = 10, value2 = 0, answer = 0;
        try {
            answer = value1 / value2;
            System.out.println("answer ---> " + answer);
        } catch (ArithmeticException ae) {
            System.out.println("0で除算しました");
            System.out.println("Exception : " + ae);
        }
    }
}