package pro.kensait.java.ec_final;

public class Transaction {
    public void order(CustomerBase customer, int totalPrice) {
        if (customer.overTotalPrice(totalPrice)) {
            return; // ここでは便宜上、何もしないでリターンする
        }
        int point = totalPrice / 10;
        customer.addPoint(point);
    }
}