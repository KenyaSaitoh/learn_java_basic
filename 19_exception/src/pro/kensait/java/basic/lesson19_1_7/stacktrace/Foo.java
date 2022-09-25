package pro.kensait.java.basic.lesson19_1_7.stacktrace;

public class Foo {
    public int process(String param) {
        Bar bar = new Bar();
        int length = bar.process(param);
        return length;
    }
}