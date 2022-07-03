package pro.kensait.java.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamMain {

    public static void main(String[] args) {
        String fileName = args[0];
        try {
            int[] b = { 1, 2, 3 };
            PrintStream ps = new PrintStream(new FileOutputStream(fileName));
            for (int i = 0; i < b.length; i++) {
                ps.println(b[i]);
                System.out.println("ファイルに書き込んだint値 ---> " + b[i]);
            }
            ps.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}