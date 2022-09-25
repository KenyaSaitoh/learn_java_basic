package pro.kensait.java.basic.lesson19_2_3.autoclose;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws Exception {
        Path path = Paths.get("foo.txt");
        try (BufferedReader br = Files.newBufferedReader(path)) { //［①］
            String line;
            while ((line = br.readLine()) != null) { //［②］
                System.out.println(line);
            }
        }
    }
}