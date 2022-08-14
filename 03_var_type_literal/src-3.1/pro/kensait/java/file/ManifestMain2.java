package pro.kensait.java.file;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.jar.Attributes;
import java.util.jar.JarFile;
import java.util.jar.Manifest;

public class ManifestMain2 {

    public static void main(String[] args) {
        String jarFileName = args[0];
        try {
            JarFile jarFile = new JarFile(jarFileName);
            Manifest manifest = jarFile.getManifest();
            Map section = manifest.getEntries(); // 個別セクション名とAttributesオブジェクトのマップを取得
            Iterator i1 = section.keySet().iterator(); // 取得したマップを、キーを取り出しながら繰り返し
            while (i1.hasNext()) {
                String entryName = (String)i1.next();
                Attributes attributes = (Attributes)section.get(entryName); // 個別セクションのAttributesオブジェクトを取得
                System.out.println("=====[ " + entryName + " ]=====");
                Set set = attributes.keySet(); // Attributesオブジェクト内のキーのセットを取得
                Iterator i2 = set.iterator();
                while (i2.hasNext()) {
                    Attributes.Name key = (Attributes.Name)i2.next();
                    String value = (String)attributes.get(key); // キーに対応する値を取得
                    System.out.println(key + " ---> " + value);
                }
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}