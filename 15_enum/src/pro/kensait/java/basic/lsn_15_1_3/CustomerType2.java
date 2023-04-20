package pro.kensait.java.basic.lsn_15_1_3;

public enum CustomerType2 {
    //【1】列挙子
    GENERAL("一般会員", 900),
    GOLD("ゴールド会員", 900),
    PLATINUM("プラチナ会員", 600),
    DIAMOND("ダイヤモンド会員", 0);

    // フィールド
    private final String customerType;
    private final int deliveryFee;
    
    // コンストラクタ
    CustomerType2(String customerType, int deliveryFee) {
        this.customerType = customerType;
        this.deliveryFee = deliveryFee;
    }

    // メソッド
    @Override
    public String toString() {
        return customerType;
    }

    public int getDeliveryFee() {
        return deliveryFee;
    }
}