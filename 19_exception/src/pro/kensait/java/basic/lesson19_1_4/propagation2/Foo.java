package pro.kensait.java.basic.lesson19_1_4.propagation2;

public class Foo {
    public int process(String param) {
        try {
            Bar bar = new Bar();
            int length = bar.process(param);//［1］
            return length; //［2］
        } catch (IllegalArgumentException iae) { //［3］
            System.out.println("計算不可, msg => " + iae.getMessage());
            return 0; //［4］
        }
    }
}