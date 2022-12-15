package pro.kensait.java.basic.lsn_21_3_2;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

public class Main_Property {
    public static void main(String[] args) throws Exception {
        Properties props = new Properties();
        props.load(Files.newBufferedReader(
                Paths.get(System.getProperty("user.home"), "MyResource.properties"),
                StandardCharsets.UTF_8));
        String name = props.getProperty("name");
        int age = Integer.parseInt(props.getProperty("age"));
        String address = props.getProperty("address");
        System.out.println(name + ", " + age + ", " + address);
    }
}