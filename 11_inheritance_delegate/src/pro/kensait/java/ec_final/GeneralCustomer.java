package pro.kensait.java.ec_final;

public class GeneralCustomer extends CustomerBase {
    public GeneralCustomer(int id, String name) {
        super(id, name);
    }

    // ポイントを加算する（オーバーライド）
    @Override
    public void addPoint(int value) {
        this.point = this.point + value;
    }
}