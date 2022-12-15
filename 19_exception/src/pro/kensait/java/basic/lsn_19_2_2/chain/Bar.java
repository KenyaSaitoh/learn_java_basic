package pro.kensait.java.basic.lsn_19_2_2.chain;

public class Bar {
    public int process(String param) {
        int length = param.length();
        if (10 < length) {
            throw new IllegalArgumentException("文字列長が過大"); //［5］
        }
        return length; //［6］
    }
}