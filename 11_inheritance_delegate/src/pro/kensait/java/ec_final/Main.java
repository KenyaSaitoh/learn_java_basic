package pro.kensait.java.ec_final;

public class Main {
    public static void main(String[] args) {
        CustomerBase alice = new GeneralCustomer(1, "Alice");
        CustomerBase bob = new GoldCustomer(2, "Bob");

        Transaction tran = new Transaction();
        tran.order(alice, 1000);
        tran.order(bob, 2000);

        System.out.println(alice.getPoint());
        System.out.println(bob.getPoint());
    }
}
