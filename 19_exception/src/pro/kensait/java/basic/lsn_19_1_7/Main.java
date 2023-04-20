package pro.kensait.java.basic.lsn_19_1_7;

import java.util.Scanner;

public class Main {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        System.out.print("param? => ");
        String param = (new Scanner(System.in).nextLine());

        Foo foo = new Foo();
        try {
            int length = foo.process(param);
            System.out.println(length); 
        } catch(IllegalArgumentException iae) {
            iae.printStackTrace(); //【1】
        }
    }
}