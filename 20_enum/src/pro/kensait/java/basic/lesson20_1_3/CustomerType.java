package pro.kensait.java.basic.lesson20_1_3;

public enum CustomerType {
    // 列挙子
    GENERAL("一般会員"),
    GOLD("ゴールド会員"),
    PLATINUM("プラチナ会員"),
    DIAMOND("ダイヤモンド会員");

    // フィールド
    private final String customerType;

    // コンストラクタ
    CustomerType(String customerType) {
        this.customerType = customerType;
    }

    // メソッド
    @Override
    public String toString() {
        return customerType;
    }
}