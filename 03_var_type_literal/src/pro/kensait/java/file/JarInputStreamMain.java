package pro.kensait.java.file;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.jar.JarEntry;
import java.util.jar.JarInputStream;

public class JarInputStreamMain {

    public static void main(String[] args) {
        String jarFileName = args[0];
        try {
            JarInputStream jis = new JarInputStream(new FileInputStream(jarFileName));
            BufferedReader br = null;
            JarEntry entry = null;
            // JAR入力ストリームにあるJARエントリの内容を出力する
            while ((entry = jis.getNextJarEntry()) != null) {
                String entryName = entry.getName();
                System.out.println("===== " + entryName + " =====");
                br = new BufferedReader(new InputStreamReader(jis));
                String str;
                while ((str = br.readLine()) != null) {
                    System.out.println(str);
                }
                jis.closeEntry();
            }
            br.close();
            jis.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}