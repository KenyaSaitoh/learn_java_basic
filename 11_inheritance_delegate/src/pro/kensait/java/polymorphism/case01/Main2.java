package pro.kensait.java.polymorphism.case01;

public class Main2 {
    public static void main(String[] args) {
        Foo foo1 = new Qux();
        foo1.doSomething();
        Bar bar = (Bar) foo1;
        bar.doSomething();
    }
}