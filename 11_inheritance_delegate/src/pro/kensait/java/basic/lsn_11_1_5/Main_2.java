package pro.kensait.java.basic.lsn_11_1_5;

import pro.kensait.java.basic.lsn_11_1_3.CustomerBase;
import pro.kensait.java.basic.lsn_11_1_3.GeneralCustomer;
import pro.kensait.java.basic.lsn_11_1_3.GoldCustomer;

public class Main_2 {
    public static void main(String[] args) {
        CustomerBase alice = new GeneralCustomer(1, "Alice");
        CustomerBase bob = new GoldCustomer(2, "Bob");

        Transaction tran = new Transaction();
        tran.order(alice, 100_000);
        tran.order(bob, 200_000);

        System.out.println(alice.getPoint());
        System.out.println(bob.getPoint());
    }
}