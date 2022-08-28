package pro.kensait.java.ec;

public class GeneralCustomer extends AbstractCustomer {
    private static final int TOTAL_PRICE_LIMIT = 500_000;

    public GeneralCustomer(String name, Integer customerType, String address,
            Integer point) {
        super(name, customerType, address, point);
    }

    // 購入金額の上限をチェックする（オーバーライド）
    @Override
    public void checkTotalPrice(int totalPrice) throws Exception {
        if (TOTAL_PRICE_LIMIT < totalPrice) {
            throw new Exception("限度額オーバー");
        }
    }

    // ポイントを加算する（オーバーライド）
    @Override
    public void addPoint(int value) {
        this.point = this.point + value;
    }
}
