package pro.kensait.java.basic.lsn_19_1_4.case_1;

import java.util.Scanner;

public class Main {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        System.out.print("param? => ");
        String param = (new Scanner(System.in).nextLine());

        Foo foo = new Foo();
        int length = foo.process(param); //［1］
        System.out.println(length); //［2］ 
    }
}