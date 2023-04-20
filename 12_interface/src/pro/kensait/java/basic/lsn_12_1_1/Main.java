package pro.kensait.java.basic.lsn_12_1_1;

public class Main {
    public static void main(String[] args) {
        Foo foo1 = new Hoge(); //【1】
        Foo foo2 = new Piyo(); //【2】
        foo1.sayYes(); //【3】
        foo2.sayYes(); //【4】
    }
}