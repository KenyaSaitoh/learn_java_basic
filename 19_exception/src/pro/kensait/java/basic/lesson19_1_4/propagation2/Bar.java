package pro.kensait.java.basic.lesson19_1_4.propagation2;

public class Bar {
    public int process(String param) {
        int length = param.length();
        if (20 < length) {
            throw new IllegalArgumentException("文字列長が過大"); //［⑤］
        }
        return length; //［⑥］
    }
}