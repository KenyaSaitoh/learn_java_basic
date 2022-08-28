package pro.kensait.java.ec2;

// Customerクラスとしての共通実装を提供する
public abstract class AbstractCustomer {
    protected int id; // ID
    protected String name; // 名前
    protected int point; // ポイント

    public AbstractCustomer(int id, String name) {
        this.id = id;
        this.name = name;
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

    // 購入金額の上限をチェックする（抽象メソッド）
    public abstract boolean overTotalPrice(int totalPrice);

    // ポイントを加算する（抽象メソッド）
    public abstract void addPoint(int value);
}
