import java.util.Scanner;

public class Main_Switch_2 {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws Exception {
        System.out.print("customerType? (GENERAL, GOLD, PLATINUM, DIAMOND) => ");
        String customerType = new Scanner(System.in).nextLine();

        int deliveryFee = 0;
        switch (customerType) { // String型変数
        case "GENERAL", "GOLD": // 一般会員またはゴールド会員を表すラベル
            deliveryFee = 900;
            break;
        case "PLATINUM": // プラチナ会員を表すラベル
            deliveryFee = 600;
            break;
        case "DIAMOND": // ダイヤモンド会員を表す値
            deliveryFee = 0;
            break;
        }

        System.out.println("deliveryFee => " + deliveryFee);
    }
}