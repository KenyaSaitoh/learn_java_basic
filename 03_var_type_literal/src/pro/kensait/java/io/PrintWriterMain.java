package pro.kensait.java.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterMain {

    public static void main(String[] args) {
        String fileName = args[0];
        String[] st = { "Foo", "Bar", "Baz", "Qux" };
        try {
            File file = new File(fileName);
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(file)));
            for (int i = 0; i < st.length; i++) {
                pw.println(st[i]);
            }
            pw.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}