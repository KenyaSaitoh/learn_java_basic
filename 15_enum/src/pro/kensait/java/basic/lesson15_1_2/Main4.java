package pro.kensait.java.basic.lesson15_1_2;

public class Main4 {
    public static void main(String[] args) {
        Customer customer = new Customer(1, "Alice", CustomerType.PLATINUM);
        int deliveryFee = switch (customer.getCustomerType()) {
        case GENERAL, GOLD -> 900;
        case PLATINUM -> 600;
        case DIAMOND -> {
            System.out.println("ダイヤモンド会員の場合");
            yield 0;
        }
        };
        System.out.println("deliveryFee => " + deliveryFee);
    }
}