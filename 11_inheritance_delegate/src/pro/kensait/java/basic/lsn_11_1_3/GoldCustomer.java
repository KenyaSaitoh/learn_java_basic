package pro.kensait.java.basic.lsn_11_1_3;

public class GoldCustomer extends CustomerBase {
    public GoldCustomer(int id, String name) {
        super(id, name);
    }

    // ポイントを加算する（オーバーライド）
    @Override
    public void addPoint(int totalPrice) {
        int point = (int) (totalPrice * 0.1); // 購入金額の10%
        this.point = this.point + point;
    }
}