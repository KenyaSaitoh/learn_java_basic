package pro.kensait.java.basic.lsn_19_1_4.case_4;

import java.io.IOException;

public class Foo {
    public int process(String param) {
        try {
            Bar bar = new Bar();
            int length = bar.process(param);
            return length;
        } catch (IOException ioe) {
            return 0;
        }
    }
}