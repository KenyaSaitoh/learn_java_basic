package pro.kensait.java.exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class StackTraceMain {

    public static void main(String[] args) {
        StackTraceMain mainClass = new StackTraceMain();
        mainClass.method1();
    }

    private void method1() {
        try {
            method2();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("##### 例外処理終了 #####");
        }
    }

    private void method2() throws Exception {
        try {
            method3();
        } catch (IOException ioe) {
            ioe.printStackTrace();
            throw new Exception("次にキャッチ後に再スローした例外");
        }
    }

    private void method3() throws IOException {
        try {
            System.out.println("##### 例外発生 #####");
            throw new FileNotFoundException("最初に発生した例外");
        } catch (IOException ioe) {
            ioe.printStackTrace();
            throw new IOException("最初にキャッチ後に再スローした例外");
        }
    }
}