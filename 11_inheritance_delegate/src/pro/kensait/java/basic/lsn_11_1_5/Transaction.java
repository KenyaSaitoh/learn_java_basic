package pro.kensait.java.basic.lsn_11_1_5;

import pro.kensait.java.basic.lsn_11_1_3.CustomerBase;

public class Transaction {
    public void order(CustomerBase customer, int totalPrice) {
        if (customer.overTotalPrice(totalPrice)) {
            return; // ここでは便宜上、何もしないでリターンする
        }
        customer.addPoint(totalPrice);
    }
}