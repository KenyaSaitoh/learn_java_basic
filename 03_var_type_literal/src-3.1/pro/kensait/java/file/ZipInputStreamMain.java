package pro.kensait.java.file;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ZipInputStreamMain {

    public static void main(String[] args) {
        String zipFileName = args[0];
        try {
            ZipInputStream zis = new ZipInputStream(new FileInputStream(zipFileName));
            BufferedReader br = null;
            ZipEntry entry = null;
            // ZIP入力ストリームにあるZIPエントリの内容を出力する
            while ((entry = zis.getNextEntry()) != null) {
                String entryName = entry.getName();
                System.out.println("===== " + entryName + " =====");
                br = new BufferedReader(new InputStreamReader(zis));
                String str;
                while ((str = br.readLine()) != null) {
                    System.out.println(str);
                }
                zis.closeEntry();
            }
            br.close();
            zis.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}