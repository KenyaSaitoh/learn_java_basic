import java.util.Scanner;

public class Main_If_6 {
    @SuppressWarnings({ "resource", "unused" })
    public static void main(String[] args) throws Exception {
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
        } else { // ゴールド会員の場合
            deliveryFee = 300;
        }

        System.out.println("deliveryFee => " + deliveryFee);
    }
}