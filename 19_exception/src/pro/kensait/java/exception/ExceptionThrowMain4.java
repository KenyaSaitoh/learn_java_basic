package pro.kensait.java.exception;

public class ExceptionThrowMain4 {

    public static void main(String[] args) throws IllegalAccessException {
        System.out.println("##### Before #####");
        checkException();
        System.out.println("##### After #####");
    }

    public static void checkException() throws IllegalAccessException {
        throw new IllegalAccessException();
    }
}