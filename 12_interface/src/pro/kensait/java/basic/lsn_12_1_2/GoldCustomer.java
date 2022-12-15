package pro.kensait.java.basic.lsn_12_1_2;

public class GoldCustomer extends CustomerBase implements NameAggregator,
        FamilySpec {
    private CustomerBase[] family;
    public GoldCustomer(int id, String name, String address) {
        super(id, name, address);
    }

    // ポイントを加算する（オーバーライド）
    @Override
    public void addPoint(int value) {
        this.point = this.point + value * 2; // ポイントは2倍加算
    }

    // 状態を無効にする（オーバーライド）
    @Override
    public void invalidate() {
        setInvalid(true);
    }

    @Override
    public CustomerBase[] getFamily() {
        return family;
    }

    @Override
    public void setFamily(CustomerBase[] family) {
        this.family = family;
    }
}