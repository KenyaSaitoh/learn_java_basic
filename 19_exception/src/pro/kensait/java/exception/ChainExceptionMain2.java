package pro.kensait.java.exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ChainExceptionMain2 {

    public static void main(String[] args) {
        try {
            ChainExceptionTarget2 target = new ChainExceptionTarget2();
            target.throwIOException();
        } catch (IOException ioe) {
            System.out.println("##### キャッチ後に再スローしたIOExceptionのスタックトレースを出力 #####");
            ioe.printStackTrace();
            System.out.println("##### 根本原因の例外のスタックトレースを出力 #####");
            Throwable throwable = ioe.getCause();
            throwable.printStackTrace();
        }
    }
}

/* ======================================== */
class ChainExceptionTarget2 {

    public void throwIOException() throws IOException {
        try {
            throw new FileNotFoundException("最初に発生したFileNotFoundException");
        } catch (FileNotFoundException fnfe) {
            System.out.println("##### まずは最初のFileNotFoundExceptionのスタックトレースを出力 #####");
            fnfe.printStackTrace();
            IOException ioe = new IOException("一度キャッチして、再度スローしたIOException");
            ioe.initCause(fnfe);
            throw ioe;
        }
    }
}
