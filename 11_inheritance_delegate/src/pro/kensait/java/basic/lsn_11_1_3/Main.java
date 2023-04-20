package pro.kensait.java.basic.lsn_11_1_3;

public class Main {
    public static void main(String[] args) {
        {
            System.out.println("***** snippet_1 *****");
            // GeneralCustomer
            CustomerBase alice = new GeneralCustomer(1, "Alice");
            int totalPrice = 100_000; // 購入金額 
            if (alice.overTotalPrice(totalPrice)) { //【1】
                // 上限チェック違反だった場合の処理
                return; // ここでは便宜上、何もしないでリターンする
            }
            alice.addPoint(totalPrice); //【2】
            System.out.println(alice.getPoint());
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_2 *****");
            // GoldCustomer
            CustomerBase bob = new GoldCustomer(2, "Bob");
            int totalPrice = 200_000; // 購入金額 
            if (bob.overTotalPrice(totalPrice)) { //【1】
                return; // ここでは便宜上、何もしないでリターンする
            }
            bob.addPoint(totalPrice); //【2】
            System.out.println(bob.getPoint());
            System.out.println("=> end");
        }
    }
}