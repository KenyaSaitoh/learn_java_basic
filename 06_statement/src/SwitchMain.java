class SwitchMain {
    public static void main(String[] args) {
        int customerType = 0;
        int point = 0;
        switch (customerType) { // int型変数
        case 0, 1: // ダイヤモンド会員とプラティナ会員を表す値
            point += 1000;
            break;
        case 2: // ゴールド会員を表す値
            point += 500;
            break;
        case 3: // 一般会員を表す値
            point += 200;
            break;
        }
        System.out.println(point);
    }
}