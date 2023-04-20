package pro.kensait.java.basic.lsn_15_1_3;

public enum CustomerType {
    //【1】列挙子
    GENERAL("一般会員"),
    GOLD("ゴールド会員"),
    PLATINUM("プラチナ会員"),
    DIAMOND("ダイヤモンド会員");

    //【2】フィールド
    private final String customerType;

    //【3】コンストラクタ
    CustomerType(String customerType) {
        this.customerType = customerType;
    }

    //【4】メソッド
    @Override
    public String toString() {
        return customerType;
    }
}