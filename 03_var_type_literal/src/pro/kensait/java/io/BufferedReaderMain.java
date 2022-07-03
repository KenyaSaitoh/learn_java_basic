package pro.kensait.java.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderMain {

    public static void main(String[] args) {
        String fileName = args[0];
        try {
            File file = new File(fileName);
            BufferedReader br = new BufferedReader(new FileReader(file));
            String str;
            while ((str = br.readLine()) != null) {
                System.out.println(str);
            }
            br.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}