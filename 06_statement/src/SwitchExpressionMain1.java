class SwitchExpressionMain1 {
    public static void main(String[] args) {
        int customerType = 0;
        int point = 0;
        switch (customerType) { // int型変数
            case 0, 1 -> { // ダイヤモンド会員とプラティナ会員を表す値
                point += 1000;
            }
            case 2 -> { // ゴールド会員を表す値
                point += 500;
            }
            case 3 -> { // 一般会員を表す値
                point += 200;
            }
            default -> {
                // エラー処理など
            }
        }
        System.out.println(point);
    }
}