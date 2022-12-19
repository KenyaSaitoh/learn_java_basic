package pro.kensait.java.basic.lsn_19_1_5;

import java.io.IOException;

public class Main_4 {
    public static void main(String[] args) {
        try {
            Hoge hoge = new Hoge();
            hoge.process();
        } catch (IOException ioe) {
            System.out.println("例外発生, msg => " + ioe.getMessage());
        }
    }
}