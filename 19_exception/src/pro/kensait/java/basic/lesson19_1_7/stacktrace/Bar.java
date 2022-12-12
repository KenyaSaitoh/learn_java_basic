package pro.kensait.java.basic.lesson19_1_7.stacktrace;

public class Bar {
    public int process(String param) {
        int length = param.length();
        if (10 < length) {
            throw new IllegalArgumentException("文字列長が過大");
        }
        return length;
    }
}