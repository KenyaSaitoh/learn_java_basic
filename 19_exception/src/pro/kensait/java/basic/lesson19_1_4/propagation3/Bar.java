package pro.kensait.java.basic.lesson19_1_4.propagation3;

import java.net.MalformedURLException;
import java.net.URL;

public class Bar {
    public int process(String param) {
        try {
            URL url = new URL(param); //［①］
            return url.toString().length();
        } catch (MalformedURLException mue) { //［②］
            System.out.println("URL生成不可, msg => " + mue.getMessage());
            return 0; //［③］
        }
    }
}