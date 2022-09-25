package pro.kensait.java.basic.lesson19_1_5.catches;

import java.io.FileNotFoundException;
import java.net.MalformedURLException;

public class Main3 {
    public static void main(String[] args) {
        try {
            if (args[0].equals("")) {
                throw new FileNotFoundException();
            }
            throw new MalformedURLException();
        } catch (FileNotFoundException | MalformedURLException ex) {
            System.out.println("例外発生, msg => " + ex.getMessage());
        }
    }
}