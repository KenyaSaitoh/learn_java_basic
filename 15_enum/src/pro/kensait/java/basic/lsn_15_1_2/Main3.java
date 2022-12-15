package pro.kensait.java.basic.lsn_15_1_2;

public class Main3 {
    public static void main(String[] args) {
        Customer customer = new Customer(1, "Alice", CustomerType.PLATINUM);
        int deliveryFee;
        switch (customer.getCustomerType()) { // int型変数
        case GENERAL, GOLD: // 一般会員またはゴールド会員を表すラベル
            deliveryFee = 900;
            break;
        case PLATINUM: // プラチナ会員を表すラベル
            deliveryFee = 600;
            break;
        case DIAMOND: // ダイヤモンド会員を表すラベル
            deliveryFee = 0;
            break;
        }
    }
}