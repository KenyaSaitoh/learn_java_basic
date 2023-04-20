package pro.kensait.java.basic.lsn_19_1_4.case_1;

public class Foo {
    public int process(String param) {
        Bar bar = new Bar();
        int length = bar.process(param); //【3】
        return length; //【4】
    }
}