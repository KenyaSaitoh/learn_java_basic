package pro.kensait.java.basic.lsn_19_1_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        Path path = Paths.get("foo.txt");
        BufferedReader br = null; //【1】
        try {
            // ファイルをオープンし、読み込みのためのBufferedReaderを取得
            br = Files.newBufferedReader(path);
            String line;
            // 一行ずつ読み込み、コンソールに表示
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException ioe) {
            System.out.println("ERROR, msg => " + ioe.getMessage());
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException ioe) {
                    System.out.println("ERROR, msg => " + ioe.getMessage());
                }
            }
        }
    }
}