package pro.kensait.java.ec;

import java.util.List;

public class PlatinumCustomer extends AbstractCustomer
        implements NameAggregatable, FamilySpec<AbstractCustomer> {
    private static final int TOTAL_PRICE_LIMIT = 3_000_000;

    private List<AbstractCustomer> familyList;

    public PlatinumCustomer(String name, Integer customerType, String address,
            Integer point) {
        super(name, customerType, address, point);
    }

    @Override
    public List<AbstractCustomer> getFamilyList() {
        return familyList;
    }

    @Override
    public void setFamilyList(List<AbstractCustomer> familyList) {
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
        this.point = this.point + value * 3;
    }
}