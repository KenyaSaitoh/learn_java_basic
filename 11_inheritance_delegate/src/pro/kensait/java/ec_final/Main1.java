package pro.kensait.java.ec_final;

public class Main1 {
    public static void main(String[] args) {
        {
            // GeneralCustomer
            CustomerBase alice = new GeneralCustomer(1, "Alice");
            int totalPrice = 100_000;
            if (alice.overTotalPrice(totalPrice)) {
                return; // ここでは便宜上、何もしないでリターンする
            }
            alice.addPoint(totalPrice);
            System.out.println(alice.getPoint());
        }
        {
            // GoldCustomer
            CustomerBase bob = new GoldCustomer(2, "Bob");
            int totalPrice = 200_000;
            if (bob.overTotalPrice(totalPrice)) {
                return; // ここでは便宜上、何もしないでリターンする
            }
            bob.addPoint(totalPrice);
            System.out.println(bob.getPoint());
        }
    }
}