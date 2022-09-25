package pro.kensait.java.basic.lesson19_1_4.propagation4;

import java.net.MalformedURLException;

public class Main {
    public static void main(String[] args) throws MalformedURLException {
        Foo foo = new Foo();
        int length = foo.process(args[0]); //［①］
        System.out.println(length); //［②］ 
    }
}