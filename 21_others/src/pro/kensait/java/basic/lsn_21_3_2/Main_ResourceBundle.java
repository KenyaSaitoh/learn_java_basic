package pro.kensait.java.basic.lsn_21_3_2;

import java.util.ResourceBundle;

public class Main_ResourceBundle {
    public static void main(String[] args) {
        ResourceBundle rb = ResourceBundle.getBundle("MyResource");
        String name = rb.getString("name");
        int age = Integer.parseInt(rb.getString("age"));
        String address = rb.getString("address");
        System.out.println(name + ", " + age + ", " + address);
    }
}