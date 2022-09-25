package pro.kensait.java.basic.lesson19_2_2.chain;

public class Main {
    public static void main(String[] args) {
        Foo foo = new Foo();
        try {
            int length = foo.process("aaaaaaaaaaaaaaaaaaaaa"); //［①］
            System.out.println(length); //［②］ 
        } catch (BusinessException be) {
            be.printStackTrace();
            Throwable t = be.getCause();
            t.printStackTrace();
        }
    }
}