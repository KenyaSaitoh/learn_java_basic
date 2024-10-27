package pro.kensait.java.basic.lsn_15_1_2;

public class Main_Switch {
    public static void main(String[] args) {
        Customer customer = new Customer(1, "Alice", CustomerType.PLATINUM);
        int deliveryFee = switch(customer.getCustomerType()) {
        case GENERAL, GOLD -> 900; // 一般会員またはゴールド会員を表すラベル
        case PLATINUM -> 600; // プラチナ会員を表すラベル
        case DIAMOND -> 0; // ダイヤモンド会員を表すラベル
        };
    }
}