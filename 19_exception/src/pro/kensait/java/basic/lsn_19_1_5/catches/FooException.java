package pro.kensait.java.basic.lsn_19_1_5.catches;

public class FooException extends Exception {
    public FooException() {
        super();
    }

    public void foo() {
        System.out.println("foo!");
    }
}
