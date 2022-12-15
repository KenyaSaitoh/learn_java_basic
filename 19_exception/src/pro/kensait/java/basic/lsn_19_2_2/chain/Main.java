package pro.kensait.java.basic.lsn_19_2_2.chain;

public class Main {
    public static void main(String[] args) {
        Foo foo = new Foo();
        try {
            int length = foo.process("foooooooooo"); //［1］
            System.out.println(length); //［2］ 
        } catch (BusinessException be) {
            be.printStackTrace();
            Throwable t = be.getCause();
            t.printStackTrace();
        }
    }
}