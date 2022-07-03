package pro.kensait.java.io;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class StringReaderWriterMain {

    public static void main(String[] args) {
        try {
            // StringWriterの生成
            StringWriter sw = new StringWriter();
            sw.write("Foo\n");
            sw.write("Bar\n");
            sw.write("Baz\n");
            // StringReaderの生成
            StringReader sr = new StringReader(sw.toString());
            int data;
            while ((data = sr.read()) != -1) {
                System.out.print((char)data);
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}