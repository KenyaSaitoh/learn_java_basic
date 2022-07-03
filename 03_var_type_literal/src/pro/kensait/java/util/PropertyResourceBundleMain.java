package pro.kensait.java.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;

public class PropertyResourceBundleMain {

    public static void main(String[] args) {
        String propertiesFileName = args[0];
        String key = args[1];
        PropertyResourceBundleMain mainClass = new PropertyResourceBundleMain();
        mainClass.printPropertiesValue(propertiesFileName, key);
    }

    private void printPropertiesValue(String propertiesFileName, String key) {
        InputStream inputStream = null;
        try {
            inputStream = getClass().getResourceAsStream(propertiesFileName);
            if (inputStream == null) {
                throw new IOException();
            }
            ResourceBundle resource = new PropertyResourceBundle(inputStream);
            System.out.println(resource.getString(key));
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}