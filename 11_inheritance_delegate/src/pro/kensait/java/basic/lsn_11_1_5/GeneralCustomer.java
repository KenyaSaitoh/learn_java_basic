package pro.kensait.java.basic.lsn_11_1_5;

public class GeneralCustomer extends CustomerBase {
    public GeneralCustomer(int id, String name) {
        super(id, name);
    }

    // ポイントを加算する（オーバーライド）
    @Override
    public void addPoint(int totalPrice) {
        int point = (int) (totalPrice * 0.05); // 購入金額の5%
        this.point = this.point + point;
    }
}