package pro.kensait.java.util;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceMain {

    public static void main(String[] args) {
        ResourceMain mainClass = new ResourceMain();
        mainClass.method();
    }

    public void method() {
        Locale lc = new Locale("ja", "");
        System.out.println("Language ---> " + lc.getLanguage());
        ResourceBundle rb = ResourceBundle.getBundle("MyResource", lc);
        String name1 = rb.getString("Name1");
        String name2 = rb.getString("Name2");
        System.out.println("Name1 ---> " + name1);
        System.out.println("Name2 ---> " + name2);
    }
}