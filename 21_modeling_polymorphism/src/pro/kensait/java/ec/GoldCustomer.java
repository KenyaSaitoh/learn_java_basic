package pro.kensait.java.ec;

import java.util.List;

public class GoldCustomer extends AbstractCustomer implements FamilySpec<Customer> {
    private static final int TOTAL_PRICE_LIMIT = 1_000_000;

    private List<Customer> familyList;

    public GoldCustomer(String name, Integer customerType, String address,
            Integer point) {
        super(name, customerType, address, point);
    }

    @Override
    public List<Customer> getFamilyList() {
        return familyList;
    }

    @Override
    public void setFamilyList(List<Customer> familyList) {
        this.familyList = familyList;
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
        this.point = this.point + value * 2;
    }
}
