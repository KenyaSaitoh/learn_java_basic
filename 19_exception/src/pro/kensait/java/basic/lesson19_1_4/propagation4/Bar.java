package pro.kensait.java.basic.lesson19_1_4.propagation4;

import java.net.MalformedURLException;
import java.net.URL;

public class Bar {
    public int process(String param) throws MalformedURLException { //［1］
        URL url = new URL(param);
        return url.toString().length();
    }
}