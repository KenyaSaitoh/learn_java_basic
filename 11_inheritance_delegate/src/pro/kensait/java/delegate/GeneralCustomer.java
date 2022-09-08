package pro.kensait.java.delegate;

public class GeneralCustomer {
    private DelegatedCustomer delegatedCustomer;

    public GeneralCustomer(String name, int point) {
        delegatedCustomer = new DelegatedCustomer(name, point);
    }

    public int getId() {
        return delegatedCustomer.getId();
    }

    public void setId(int id) {
        delegatedCustomer.setId(id);
    }

    public String getName() {
        return delegatedCustomer.getName();
    }

    public void setName(String name) {
        delegatedCustomer.setName(name);
    }

    public int getPoint() {
        return delegatedCustomer.getPoint();
    }

    public void setPoint(int point) {
        delegatedCustomer.setPoint(point);
    }

    // 購入金額の上限をチェックする
    public boolean overTotalPrice(int totalPrice) {
        return delegatedCustomer.overTotalPrice(totalPrice);
    }

    // ポイントを加算する
    public void addPoint(int value) {
        setPoint(getPoint() + value);
    }
}