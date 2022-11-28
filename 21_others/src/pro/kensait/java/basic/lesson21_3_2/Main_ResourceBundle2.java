package pro.kensait.java.basic.lesson21_3_2;

import java.util.Locale;
import java.util.ResourceBundle;

public class Main_ResourceBundle2 {
    public static void main(String[] args) {
        Locale locale = new Locale("en");
        System.out.println("Language => " + locale.getLanguage());
        ResourceBundle rb = ResourceBundle.getBundle("MyResource", locale);
        String name = rb.getString("name");
        int age = Integer.parseInt(rb.getString("age"));
        String address = rb.getString("address");
        System.out.println(name + ", " + age + ", " + address);
    }
}