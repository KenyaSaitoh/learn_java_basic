package pro.kensait.java.exception;

public class ExceptionThrowMain6 {

    public static void main(String[] args) {
        String param = args[0];
        int value = Integer.parseInt(param);
        try {
            calc(value);
        } catch (MyException me) {
            System.out.println("===== エラーメッセージ =====");
            System.out.println(me.getMessage());
            System.out.println("===== エラーコード =====");
            System.out.println(me.getErrorCode());
            System.out.println("===== スタックトレース =====");
            me.printStackTrace();
        }
    }

    public static void calc(int value) throws MyException {
        if (0 <= value) {
            System.out.println("value = " + value);
            throw new MyException("0以上例外", "ERR001");
        } else {
            System.out.println("value = " + value);
            throw new MyException("0未満例外", "ERR002");
        }
    }
}

/* ======================================== */
class MyException extends Exception {

    private String errorCode;

    public MyException(String message) {
        super(message);
    }

    public MyException(String message, String errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return this.errorCode;
    }
}