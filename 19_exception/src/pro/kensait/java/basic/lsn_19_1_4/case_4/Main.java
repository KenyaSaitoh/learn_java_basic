package pro.kensait.java.basic.lsn_19_1_4.case_4;

import java.net.MalformedURLException;
import java.util.Scanner;

public class Main {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws MalformedURLException {
        System.out.print("param? => ");
        String param = (new Scanner(System.in).nextLine());

        Foo foo = new Foo();
        int length = foo.process(param);
        System.out.println(length);
    }
}