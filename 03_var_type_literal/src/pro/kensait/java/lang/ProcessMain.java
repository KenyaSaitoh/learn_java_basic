package pro.kensait.java.lang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ProcessMain {

    public static void main(String[] args) {
        try {
            Runtime rt = Runtime.getRuntime();
            String[] commands = { "ls", "-ltr", "*txt" };
            Process ps = rt.exec(commands);
            InputStream is = ps.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String str;
            while ((str = br.readLine()) != null) {
                System.out.println(str);
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}