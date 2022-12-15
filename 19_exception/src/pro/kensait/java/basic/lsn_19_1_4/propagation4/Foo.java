package pro.kensait.java.basic.lsn_19_1_4.propagation4;

import java.io.IOException;

public class Foo {
    public int process(String param) {
        try {
            Bar bar = new Bar();
            int length = bar.process(param);
            return length; //［1］
        } catch (IOException ioe) { //［2］
            return 0;
        }
    }
}