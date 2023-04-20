package pro.kensait.java.basic.lsn_21_3_2;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;
import java.util.ResourceBundle;

public class Main {
    public static void main(String[] args) throws Exception {
        {
            System.out.println("***** snippet_1 *****");
            Properties props = new Properties(); //【1】
            props.load(Files.newBufferedReader(
                    Paths.get(System.getProperty("user.home"), "MyResource.properties"),
                    StandardCharsets.UTF_8)); //【2】
            String name = props.getProperty("name"); //【3】
            int age = Integer.parseInt(props.getProperty("age")); //【4】
            String address = props.getProperty("address"); //【5】
            System.out.println(name + ", " + age + ", " + address);
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_2 *****");
            ResourceBundle rb = ResourceBundle.getBundle("MyResource"); //【1】
            String name = rb.getString("name"); //【2】
            int age = Integer.parseInt(rb.getString("age")); //【3】
            String address = rb.getString("address"); //【4】
            System.out.println(name + ", " + age + ", " + address);
            System.out.println("=> end");
        }
    }
}