package pro.kensait.java.basic.lesson19_1_7.stacktrace;

public class Main {
    public static void main(String[] args) {
        Foo foo = new Foo();
        try {
            int length = foo.process(args[0]);
            System.out.println(length); 
        } catch(IllegalArgumentException iae) {
            iae.printStackTrace();
        }
    }
}