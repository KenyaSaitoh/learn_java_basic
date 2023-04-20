package pro.kensait.java.basic.lsn_11_2_1;

public class GeneralCustomer {
    //【1】委譲先インスタンスを保持するフィールド
    private DelegatedCustomer delegatedCustomer;

    //【2】コンストラクタ
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

    //【3】購入金額の上限をチェックする
    public boolean overTotalPrice(int totalPrice) {
        return delegatedCustomer.overTotalPrice(totalPrice);
    }

    //【4】ポイントを加算する
    public void addPoint(int totalPrice) {
        int point = (int) (totalPrice * 0.05); // 購入金額の5%
        setPoint(getPoint() + point);
    }
}