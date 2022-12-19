package pro.kensait.java.basic.lsn_19_1_5;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Hoge {
    public void process() throws IOException {
        try {
            // FileNotFoundExceptionが発生する可能性のある処理
            throw new FileNotFoundException();
        } catch (FileNotFoundException fnfe) { //【1】
            System.out.println("ファイル存在せず, msg => " + fnfe.getMessage());
            throw new IOException("入出力例外発生"); //【2】
        }
    }
}