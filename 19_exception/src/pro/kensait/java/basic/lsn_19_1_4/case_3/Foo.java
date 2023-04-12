package pro.kensait.java.basic.lsn_19_1_4.case_3;

public class Foo {
    public int process(String param) {
        try {
            Bar bar = new Bar();
            int length = bar.process(param);
            return length;
        } catch (IllegalArgumentException iae) {
            System.out.println("計算不可, msg => " + iae.getMessage());
            return 0;
        }
    }
}