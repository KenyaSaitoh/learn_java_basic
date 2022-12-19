package pro.kensait.java.basic.lsn_19_1_7;

public class Foo {
    public int process(String param) {
        Bar bar = new Bar();
        int length = bar.process(param);
        return length;
    }
}