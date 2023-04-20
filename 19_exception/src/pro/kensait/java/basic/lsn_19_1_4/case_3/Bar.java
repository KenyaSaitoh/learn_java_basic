package pro.kensait.java.basic.lsn_19_1_4.case_3;

import java.net.MalformedURLException;
import java.net.URL;

public class Bar {
    public int process(String param) {
        try {
            URL url = new URL(param); //【1】
            return url.toString().length();
        } catch (MalformedURLException mue) { //【2】
            System.out.println("URL生成不可, msg => " + mue.getMessage());
            return 0; //【3】
        }
    }
}