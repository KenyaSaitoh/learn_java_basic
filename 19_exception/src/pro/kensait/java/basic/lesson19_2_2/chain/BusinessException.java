package pro.kensait.java.basic.lesson19_2_2.chain;

public class BusinessException extends Exception {
    public BusinessException(String message) {
        super(message);
    }
    public BusinessException(Throwable cause) {
        super(cause);
    }
    public BusinessException(String message, Throwable cause) {
        super(message, cause);
    }
}