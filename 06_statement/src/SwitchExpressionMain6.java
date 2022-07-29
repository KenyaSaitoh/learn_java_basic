public class SwitchExpressionMain6 {
    public static void main(String[] args) {
        CustomerType customerType = CustomerType.A;
        int deliveryFee = switch (customerType) {
            case A, B -> 300; // ダイヤモンド会員とプラティナ会員を表す値
            case C -> 600; // ゴールド会員を表す値
            case D -> { // 一般会員を表す値
                yield 900;
            }
        };
        System.out.println(deliveryFee);
    }
}

enum CustomerType {
    A, B, C, D;
}