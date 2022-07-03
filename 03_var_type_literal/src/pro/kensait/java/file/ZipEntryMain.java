package pro.kensait.java.file;

import java.io.IOException;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class ZipEntryMain {

    public static void main(String[] args) {
        String zipFileName = args[0];
        try {
            ZipFile zip = new ZipFile(zipFileName);
            // エントリを列挙で取得
            Enumeration entries = zip.entries();
            // 列挙の反復処理ですべてZIPエントリの名前とサイズ、コメントを表示
            System.out.println("===== エントリの一覧 =====");
            while (entries.hasMoreElements()) {
                ZipEntry entry = zip.getEntry(entries.nextElement().toString());
                System.out.println("EntryName ---> " + entry.getName());
                System.out.println("EntrySize ---> " + entry.getSize());
                System.out.println("Directory ---> " + entry.isDirectory());
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}