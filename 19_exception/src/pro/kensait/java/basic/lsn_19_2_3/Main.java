package pro.kensait.java.basic.lsn_19_2_3;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws Exception {
        Path path = Paths.get("foo.txt");
        try (BufferedReader br = Files.newBufferedReader(path)) { //【1】
            String line;
            while ((line = br.readLine()) != null) { //【2】
                System.out.println(line);
            }
        }
    }
}