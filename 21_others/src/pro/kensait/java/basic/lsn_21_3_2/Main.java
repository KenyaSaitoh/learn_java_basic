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
            Properties props = new Properties();
            props.load(Files.newBufferedReader(
                    Paths.get(System.getProperty("user.home"), "MyResource.properties"),
                    StandardCharsets.UTF_8));
            String name = props.getProperty("name");
            int age = Integer.parseInt(props.getProperty("age"));
            String address = props.getProperty("address");
            System.out.println(name + ", " + age + ", " + address);
        }
        {
            System.out.println("***** snippet_2 *****");
            ResourceBundle rb = ResourceBundle.getBundle("MyResource");
            String name = rb.getString("name");
            int age = Integer.parseInt(rb.getString("age"));
            String address = rb.getString("address");
            System.out.println(name + ", " + age + ", " + address);
        }
    }
}