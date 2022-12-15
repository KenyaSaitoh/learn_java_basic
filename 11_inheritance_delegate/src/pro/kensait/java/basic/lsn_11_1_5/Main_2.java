package pro.kensait.java.basic.lsn_11_1_5;

public class Main_2 {
    public static void main(String[] args) {
        Foo foo = new Qux();
        foo.doSomething();
        Bar bar = (Bar) foo;
        bar.doSomething();
    }
}