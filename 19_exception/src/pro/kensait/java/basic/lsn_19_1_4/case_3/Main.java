package pro.kensait.java.basic.lsn_19_1_4.case_3;

public class Main {
    public static void main(String[] args) {
        Foo foo = new Foo();
        int length = foo.process("foo://"); //［1］
        System.out.println(length); //［2］ 
    }
}