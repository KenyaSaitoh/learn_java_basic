package pro.kensait.java.exception;

import java.io.IOException;

public class ChainExceptionMain1 {

    public static void main(String[] args) {
        try {
            ChainExceptionTarget1 target = new ChainExceptionTarget1();
            target.throwMyChainException();
        } catch (MyChainException mce) {
            System.out.println("##### キャッチ後に再スローしたMyChainExceptionのスタックトレースを出力 #####");
            mce.printStackTrace();
            System.out.println("##### 根本原因の例外のスタックトレースを出力 #####");
            Throwable throwable = mce.getCause();
            throwable.printStackTrace();
        }
    }
}

/* ======================================== */
class ChainExceptionTarget1 {

    public void throwMyChainException() throws MyChainException {
        try {
            throw new IOException("最初に発生したIOException");
        } catch (IOException ioe) {
            System.out.println("##### まずは最初のIOExceptionのスタックトレースを出力 #####");
            ioe.printStackTrace();
            throw new MyChainException("一度キャッチして、再度スローしたユーザ例外", ioe);
        }
    }
}

/* ======================================== */
class MyChainException extends Exception {

    public MyChainException(String message) {
        super(message);
    }

    public MyChainException(Throwable cause) {
        super(cause);
    }

    public MyChainException(String message, Throwable cause) {
        super(message, cause);
    }
}