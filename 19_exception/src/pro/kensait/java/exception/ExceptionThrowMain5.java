package pro.kensait.java.exception;

import java.io.IOException;

public class ExceptionThrowMain5 {

    public static void main(String[] args) {
        try {
            throw new IOException("This is Error Message!!!");
        } catch (IOException ioe) {
            System.out.println("##### Error Message #####");
            System.out.println(ioe.getMessage());
        }
    }
}