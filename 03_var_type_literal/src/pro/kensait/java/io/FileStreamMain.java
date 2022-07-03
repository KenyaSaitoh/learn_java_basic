package pro.kensait.java.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamMain {

    public static void main(String[] args) {
        String fileName = args[0];
        try {
            byte[] buf = { 1, 2, 3 };
            // ファイルへの書き込み
            FileOutputStream fos = new FileOutputStream(fileName);
            for (int i = 0; i < buf.length; i++) {
                fos.write(buf[i]);
                System.out.println("ファイルに書き込んだbyte値 ---> " + buf[i]);
            }
            fos.close();
            FileInputStream fis = new FileInputStream(fileName);
            // ファイルへの読み込み
            int c;
            while ((c = fis.read()) != -1) {
                System.out.println("ファイルから読み込んだint値 ---> " + c);
            }
            fis.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}