class SwitchMain2 {
    public static void main(String[] args) {
        String customerType = "PLATINUM";
        int point = 0;
        switch (customerType) { // String型変数
        case "DIAMOND", "PLATINUM": // ダイヤモンド会員とプラティナ会員を表す値
            point += 1000;
            //break;
        case "GOLD": // ゴールド会員を表す値
            point += 500;
            break;
        case "GENERAL": // 一般会員を表す値
            point += 200;
            break;
        }
        System.out.println(point);
    }
}