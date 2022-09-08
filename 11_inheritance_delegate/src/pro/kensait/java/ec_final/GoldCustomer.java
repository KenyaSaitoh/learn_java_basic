package pro.kensait.java.ec_final;

public class GoldCustomer extends CustomerBase {
    public GoldCustomer(int id, String name) {
        super(id, name);
    }

    // ポイントを加算する（オーバーライド）
    @Override
    public void addPoint(int value) {
        this.point = this.point + value * 2; // ポイントは2倍加算
    }
}