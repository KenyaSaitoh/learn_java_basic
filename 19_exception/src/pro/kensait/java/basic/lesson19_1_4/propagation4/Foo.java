package pro.kensait.java.basic.lesson19_1_4.propagation4;

import java.io.IOException;

public class Foo {
    public int process(String param) {
        try {
            Bar bar = new Bar();
            int length = bar.process(param);
            return length; //［①］
        } catch (IOException ioe) { //［②］
            return 0;
        }
    }
}