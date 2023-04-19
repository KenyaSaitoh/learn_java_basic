import java.util.Scanner;

public class Main_Switch_3 {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws Exception {
        System.out.print("customerType? (0:GENERAL, 1:GOLD, 2:PLATINUM, 3:DIAMOND) => ");
        int customerType = Integer.parseInt(new Scanner(System.in).nextLine());

        int deliveryFee = 0;
        switch (customerType) {
            case 0, 1 -> deliveryFee = 900;
            case 2 -> deliveryFee = 600;
            case 3 -> {
                System.out.println("ダイヤモンド会員の場合");
                deliveryFee = 0;
            }
            default -> {
                // エラー処理など
            }
        }
        System.out.println("deliveryFee => " + deliveryFee);
    }
}