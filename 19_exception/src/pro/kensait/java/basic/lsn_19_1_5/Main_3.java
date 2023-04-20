package pro.kensait.java.basic.lsn_19_1_5;

import java.io.FileNotFoundException;
import java.net.MalformedURLException;

public class Main_3 {
    public static void main(String[] args) {
        try {
            if (args[0].equals("")) {
                throw new FileNotFoundException();
            }
            throw new MalformedURLException();
        } catch (FileNotFoundException | MalformedURLException ex) { //【1】
            System.out.println("例外発生, msg => " + ex.getMessage()); //【2】
        }
    }
}