package pro.kensait.java.basic.lsn_12_1_2;

public abstract class CustomerBase {
    protected int id; // ID
    protected String name; // 名前
    protected String address; // 住所
    protected int point; // ポイント
    protected boolean invalid; // 無効フラグ

    public CustomerBase(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public boolean isInvalid() {
        return invalid;
    }

    public void setInvalid(boolean invalid) {
        this.invalid = invalid;
    }

    // 購入金額の上限をチェックする（共通実装）
    public boolean overTotalPrice(int totalPrice) {
        if (1_000_000 < totalPrice) {
            return true;
        }
        return false;
    }

    // ポイントを加算する（抽象メソッド）
    public abstract void addPoint(int value);

    @Override
    public String toString() {
        return "CustomerBase [id=" + id + ", name=" + name + ", address=" + address
                + ", point=" + point + ", invalid=" + invalid + "]";
    }
}