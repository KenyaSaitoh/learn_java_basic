package pro.kensait.java.basic.lesson17_1_3;

public enum CustomerType2 {
    // 列挙子
    GENERAL("一般会員", 900),
    GOLD("ゴールド会員", 900),
    PLATINUM("プラチナ会員", 600),
    DIAMOND("ダイヤモンド会員", 0);

    // フィールド
    private final String customerType;
    private final Integer deliveryFee;
    
    // コンストラクタ
    CustomerType2(String customerType, Integer deliveryFee) {
        this.customerType = customerType;
        this.deliveryFee = deliveryFee;
    }

    // メソッド
    @Override
    public String toString() {
        return customerType;
    }

    public double getDeliveryFee() {
        return deliveryFee;
    }
}