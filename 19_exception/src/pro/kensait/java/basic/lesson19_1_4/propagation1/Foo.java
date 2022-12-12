package pro.kensait.java.basic.lesson19_1_4.propagation1;

public class Foo {
    public int process(String param) {
        Bar bar = new Bar();
        int length = bar.process(param);//［3］
        return length; //［4］
    }
}