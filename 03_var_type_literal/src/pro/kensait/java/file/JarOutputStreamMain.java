package pro.kensait.java.file;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.jar.JarEntry;
import java.util.jar.JarOutputStream;

public class JarOutputStreamMain {

    public static void main(String[] args) {
        String[] files = new String[]{
                "file/JarEntry1.txt", "file/JarEntry2.txt"};
        String jarFileName = "file/JarFile2.jar";
        try {
            // JARデータの出力先をファイル出力ストリームを用いて指定
            JarOutputStream jos = new JarOutputStream(new FileOutputStream(jarFileName));
            // JARエントリ対象ファイル分ループし、JARエントリを生成
            for (int i = 0; i < files.length; i++) {
                String entryName = files[i];
                BufferedInputStream bis = new BufferedInputStream(new FileInputStream(entryName));
                JarEntry entry = new JarEntry(entryName);
                // 対象のJARエントリの開始位置にJAR出力ストリームを配置
                jos.putNextEntry(entry);
                // 128バイトずつ読み込んでは出力ストリームに書き込み
                byte[] buf = new byte[128];
                int size;
                while ((size = bis.read(buf, 0, buf.length)) != -1) {
                    jos.write(buf, 0, size);
                }
                // JARエントリへの出力とクローズ
                jos.flush();
                jos.closeEntry();
                bis.close();
            }
            // ストリームを閉じる
            jos.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}