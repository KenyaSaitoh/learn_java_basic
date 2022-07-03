package pro.kensait.java.file;

import java.io.IOException;
import java.util.Enumeration;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

public class JarEntryMain {

    public static void main(String[] args) {
        String jarFileName = args[0];
        try {
            JarFile jar = new JarFile(jarFileName);
            // エントリを列挙で取得
            Enumeration entries = jar.entries();
            // 列挙の反復処理ですべてZIPエントリの名前とサイズ、コメントを表示
            System.out.println("===== エントリの一覧 =====");
            while (entries.hasMoreElements()) {
                JarEntry entry = jar.getJarEntry(entries.nextElement().toString());
                System.out.println("EntryName ---> " + entry.getName());
                System.out.println("EntrySize ---> " + entry.getSize());
                System.out.println("Directory ---> " + entry.isDirectory());
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}