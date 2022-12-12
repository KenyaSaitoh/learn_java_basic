import java.util.Scanner;

public class Main_If_8 {
    @SuppressWarnings({ "resource", "unused" })
    public static void main(String[] args) throws Exception {
        // 変数セットアップ
        int GENERAL_CUSTOMER = 0;
        int GOLD_CUSTOMER = 1;

        System.out.print("totalPrice? => ");
        int totalPrice = Integer.parseInt(new Scanner(System.in).nextLine());
        System.out.print("customerType? (0:GENERAL, 1:GOLD) => ");
        int customerType = Integer.parseInt(new Scanner(System.in).nextLine());

        int deliveryFee;
        if (customerType == GENERAL_CUSTOMER) {
            if (totalPrice < 5000) {
                deliveryFee = 900;
            } else {
                deliveryFee = 300;
            }
        } else {
            if (totalPrice < 3000) {
                deliveryFee = 600;
            } else {
                deliveryFee = 0;
            }
        }

        System.out.println("deliveryFee => " + deliveryFee);
    }
}