package pro.kensait.java.basic.lsn_12_1_2;

public class PlatinumCustomer extends CustomerBase
        implements FamilySpec {
    private CustomerBase[] family;

    public PlatinumCustomer(int id, String name, String address) {
        super(id, name, address);
    }

    // ポイントを加算する（オーバーライド）
    @Override
    public void addPoint(int value) {
        this.point = this.point + value * 2; // ポイントは3倍加算
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