package pro.kensait.java.exception;

public class ExceptionMain3 {

    public static void main(String[] args) {
        int value1 = 10, value2 = 0, answer = 0;
        try {
            System.out.println("##### Before #####");
            answer = calc(value1, value2);
            System.out.println("##### After #####");
            System.out.println("answer ---> " + answer);
        } catch (ArithmeticException e) {
            System.out.println("##### 呼び出し元の例外処理 #####");
            System.out.println("Exception :" + e);
        }
    }

    public static int calc(int value1, int value2) {
        int answer;
        answer = value1 / value2;
        return answer;
    }
}