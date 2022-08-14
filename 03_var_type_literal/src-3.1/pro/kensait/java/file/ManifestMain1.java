package pro.kensait.java.file;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.jar.Attributes;
import java.util.jar.JarFile;
import java.util.jar.Manifest;

public class ManifestMain1 {

    public static void main(String[] args) {
        String jarFileName = args[0];
        try {
            JarFile jarFile = new JarFile(jarFileName);
            Manifest manifest = jarFile.getManifest();
            System.out.println("=====[ MainAttributes ]=====");
            Attributes attributes = manifest.getMainAttributes(); // メインセクションのAttributesオブジェクトを取得
            Set set = attributes.keySet(); // Attributesオブジェクト内のキーのセットを取得
            Iterator i = set.iterator();
            while (i.hasNext()) {
                Attributes.Name key = (Attributes.Name)i.next();
                String value = (String)attributes.get(key); // キーに対応する値を取得
                System.out.println(key + " ---> " + value);
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}