package pro.kensait.java.basic.lesson21_3_3;

import java.util.Locale;
import java.util.ResourceBundle;

public class Main_ResourceBundle_Locale {
    public static void main(String[] args) {
        Locale locale = new Locale("en", "US");
        ResourceBundle rb = ResourceBundle.getBundle("MyResource", locale);
        String name = rb.getString("name");
        int age = Integer.parseInt(rb.getString("age"));
        String address = rb.getString("address");
        System.out.println(name + ", " + age + ", " + address);
    }
}