package pro.kensait.java.basic.lsn_11_2_1;

// Customerクラスとしての共通実装を提供する
public class DelegatedCustomer {
    protected int id; // ID
    protected String name; // 名前
    protected int point; // ポイント

    public DelegatedCustomer(String name, int point) {
        this.name = name;
        this.point = point;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    // 購入金額の上限をチェックする（共通実装）
    public boolean overTotalPrice(int totalPrice) {
        if (1_000_000 < totalPrice) {
            return true;
        }
        return false;
    }
}
