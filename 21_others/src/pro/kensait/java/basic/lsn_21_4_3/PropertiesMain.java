package pro.kensait.java.basic.lsn_21_4_3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;

public class PropertiesMain {

    public static void main(String[] args) {
        String fileName = args[0];
        File file = new File(fileName);
        Properties props = new Properties();
        try {
            props.load(new FileInputStream(file));
            System.out.println("userName ---> " + props.getProperty("userName"));
            System.out.println("age ---> " + props.getProperty("age"));
            props.setProperty("address", "TOKYO");
            props.list(new PrintStream(new FileOutputStream(file)));
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}