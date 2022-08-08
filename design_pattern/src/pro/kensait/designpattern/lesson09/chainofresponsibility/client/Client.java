package pro.kensait.designpattern.lesson09.chainofresponsibility.client;

import pro.kensait.designpattern.lesson09.chainofresponsibility.provider.DepartmentAndJobrankSpec;
import pro.kensait.designpattern.lesson09.chainofresponsibility.provider.DepartmentSpec;
import pro.kensait.designpattern.lesson09.chainofresponsibility.provider.JobrankSpec;
import pro.kensait.designpattern.lesson09.chainofresponsibility.provider.User;
import pro.kensait.designpattern.lesson09.chainofresponsibility.provider.UserSpec;

public class Client {

    public static void main(String[] args) {
        Client client = new Client();
        client.doBusiness();
    }

    public void doBusiness() {
        // 企画部であること
        UserSpec spec1 = new DepartmentSpec("PLANNIG");
        // 部長であること
        UserSpec spec2 = new JobrankSpec(3);
        // 人事部の主任以上であること
        UserSpec spec3 = new DepartmentAndJobrankSpec("HR", 2);

        spec1.setNext(spec2).setNext(spec3);

        User carol = new User("Carol", "HR", 2); // 人事部の主任
        boolean flag1 = spec1.handle(carol);
        System.out.println("Carol => " + flag1);

        User alice = new User("Alice", "SALES", 3); // 営業部の部長
        boolean flag2 = spec1.handle(alice);
        System.out.println("Alice => " + flag2);

        User dave = new User("Dave", "SALES", 2); // 営業部の主任
        boolean flag3 = spec1.handle(dave);
        System.out.println("Dave => " + flag3);

        User ellen = new User("Ellen", "PLANNIG", 1); // 企画部のアソシエイト
        boolean flag4 = spec1.handle(ellen);
        System.out.println("Ellen => " + flag4);
    }
}
