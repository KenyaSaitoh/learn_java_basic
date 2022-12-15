package pro.kensait.java.basic.lsn_10_2_2;

public class Foo {
    void doSomething() {
        Bar bar = new Bar();
        bar.process(this); // this渡し
    }
}