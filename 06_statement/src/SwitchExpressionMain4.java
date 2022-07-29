class SwitchExpressionMain4 {
    public static void main(String[] args) {
        int customerType = 4;
        int deliveryFee = 0;
        switch (customerType) {
            case 0, 1 -> { // ダイヤモンド会員とプラティナ会員を表す値
                deliveryFee = 300;
            }
            case 2 -> { // ゴールド会員を表す値
                deliveryFee = 600;
            }
            case 3 -> { // 一般会員を表す値
                deliveryFee = 900;
            }
            default -> {
                // 例外処理など
            }
        }
        System.out.println(deliveryFee);
    }
}