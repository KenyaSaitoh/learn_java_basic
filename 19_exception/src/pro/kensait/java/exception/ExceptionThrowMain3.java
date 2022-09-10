package pro.kensait.java.exception;

public class ExceptionThrowMain3 {

    public static void main(String[] args) {
        try {
            System.out.println("##### Before #####");
            checkException();
            System.out.println("##### After #####");
        } catch (IllegalAccessException e) {
            System.out.println("##### 呼び出し元の例外処理 #####");
            System.out.println("Exception : " + e);
        }
    }

    public static void checkException() throws IllegalAccessException {
        throw new IllegalAccessException();
    }
}