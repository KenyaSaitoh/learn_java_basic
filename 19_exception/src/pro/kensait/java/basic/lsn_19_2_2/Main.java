package pro.kensait.java.basic.lsn_19_2_2;

import java.util.Scanner;

public class Main {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        System.out.print("param? => ");
        String param = (new Scanner(System.in).nextLine());

        Foo foo = new Foo();
        try {
            int length = foo.process(param); //［1］
            System.out.println(length); //［2］ 
        } catch (BusinessException be) {
            be.printStackTrace();
            Throwable t = be.getCause();
            t.printStackTrace();
        }
    }
}