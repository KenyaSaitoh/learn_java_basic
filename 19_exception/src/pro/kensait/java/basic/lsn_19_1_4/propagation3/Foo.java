package pro.kensait.java.basic.lsn_19_1_4.propagation3;

public class Foo {
    public int process(String param) {
        try {
            Bar bar = new Bar();
            int length = bar.process(param);
            return length; //［1］
        } catch (IllegalArgumentException iae) { //［2］
            System.out.println("計算不可, msg => " + iae.getMessage());
            return 0; //［3］
        }
    }
}