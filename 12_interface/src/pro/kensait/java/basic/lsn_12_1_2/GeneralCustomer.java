package pro.kensait.java.basic.lsn_12_1_2;

public class GeneralCustomer extends CustomerBase implements NameAggregator  {
    public GeneralCustomer(int id, String name, String address) {
        super(id, name, address);
    }

    // 状態を無効にする（オーバーライド）
    @Override
    public void invalidate() {
        setInvalid(true);
    }

    // ポイントを加算する（オーバーライド）
    @Override
    public void addPoint(int value) {
        this.point = this.point + value;
    }
}