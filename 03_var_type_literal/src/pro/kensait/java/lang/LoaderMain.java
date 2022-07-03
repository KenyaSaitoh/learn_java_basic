package pro.kensait.java.lang;

import java.net.URL;
import java.util.Enumeration;

public class LoaderMain {

    public static void main(String[] args) {
        String resourceName = "java/util/Vector.class";
        ClassLoader loader = LoaderMain.class.getClassLoader();
        try {
            Enumeration e = loader.getResources(resourceName);
            while (e.hasMoreElements()) {
                URL url = (URL)e.nextElement();
                System.out.println(url);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}