package pro.kensait.java.basic.lsn_19_1_4.case_3;

public class Main {
    public static void main(String[] args) {
        Foo foo = new Foo();
        int length = foo.process("foo://");
        System.out.println(length);
    }
}