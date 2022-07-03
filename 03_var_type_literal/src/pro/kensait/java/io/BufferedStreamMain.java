package pro.kensait.java.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStreamMain {

    public static void main(String[] args) {
        String inputFileName = args[0];
        String outputFileName = args[1];
        try {
            // 文字データの読み込み → 書き込み
            File inputFile = new File(inputFileName);
            File outputFile = new File(outputFileName);
            BufferedInputStream bis = new BufferedInputStream(
                    new FileInputStream(inputFile));
            BufferedOutputStream bos = new BufferedOutputStream(
                    new FileOutputStream(outputFile));
            byte[] buf = new byte[50];
            int size;
            while ((size = bis.read(buf, 0, buf.length)) != -1) {
                bos.write(buf, 0, size);
                System.out.println("ファイルに書き込んだbyte値のサイズ ---> " + size);
            }
            bis.close();
            bos.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}