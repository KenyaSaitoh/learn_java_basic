package pro.kensait.java.basic.lesson19_1_4.propagation2;

public class Foo {
    public int process(String param) {
        try {
            Bar bar = new Bar();
            int length = bar.process(param);//［①］
            return length; //［②］
        } catch (IllegalArgumentException iae) { //［③］
            System.out.println("計算不可, msg => " + iae.getMessage());
            return 0; //［④］
        }
    }
}