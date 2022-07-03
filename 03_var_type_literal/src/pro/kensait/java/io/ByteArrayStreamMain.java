package pro.kensait.java.io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayStreamMain {

    public static void main(String[] args) {
        try {
            byte[] buf = { 1, 2, 3 };
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            for (int i = 0; i < buf.length; i++) {
                // バッファに書き込む
                baos.write(buf[i]);
                System.out.println("ファイルに書き込んだbyte値 ---> " + buf[i]);
            }
            baos.close();
            ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
            int c;
            while ((c = bais.read()) != -1) {
                // バッファから読み込む
                System.out.println("ファイルから読み込んだint値 ---> " + c);
            }
            bais.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}