package pro.kensait.java.basic.lsn_19_1_4.propagation1;

public class Main {
    public static void main(String[] args) {
        Foo foo = new Foo();
        int length = foo.process(args[0]); //［1］
        System.out.println(length); //［2］ 
    }
}