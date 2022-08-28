package pro.kensait.java.ec2;

public class GeneralCustomer extends AbstractCustomer {
    public GeneralCustomer(int id, String name) {
        super(id, name);
    }

    // 購入金額の上限をチェックする（オーバーライド）
    @Override
    public boolean overTotalPrice(int totalPrice) {
        if (500_000 < totalPrice) {
            return true;
        }
        return false;
    }

    // ポイントを加算する（オーバーライド）
    @Override
    public void addPoint(int value) {
        this.point = this.point + value;
    }
}