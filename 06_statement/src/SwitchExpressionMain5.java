class SwitchExpressionMain5 {
    public static void main(String[] args) {
        int customerType = 3;
        int deliveryFee = switch (customerType) {
            case 0, 1 -> 300; // ダイヤモンド会員とプラティナ会員を表す値
            case 2 -> 600; // ゴールド会員を表す値
            case 3 -> { // 一般会員を表す値
                System.out.println("一般会員の場合");
                yield 900;
            }
            default -> 0;
        };
        System.out.println(deliveryFee);
    }
}