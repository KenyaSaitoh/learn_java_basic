package pro.kensait.java.ec_final;

public class Main2_Polymorphism {
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