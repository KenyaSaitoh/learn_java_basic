package pro.kensait.java.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderMain {

    public static void main(String[] args) {
        String fileName = args[0];
        try {
            File file = new File(fileName);
            BufferedReader br1 = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(file), "EUC-JP"));
            String str1;
            while ((str1 = br1.readLine()) != null) {
                System.out.println(str1);
            }
            br1.close();
            BufferedReader br2 = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(file), "Shift_JIS"));
            String str2;
            while ((str2 = br2.readLine()) != null) {
                System.out.println(str2);
            }
            br2.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}