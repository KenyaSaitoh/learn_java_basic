import java.util.Scanner;

public class Main_If_7 {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws Exception {
        int GENERAL_CUSTOMER = 0;
        int GOLD_CUSTOMER = 1;

        System.out.print("totalPrice? => ");
        int totalPrice = Integer.parseInt(new Scanner(System.in).nextLine());
        System.out.print("customerType? (0:GENERAL, 1:GOLD) => ");
        int customerType = Integer.parseInt(new Scanner(System.in).nextLine());

        int deliveryFee;
        if (customerType == GOLD_CUSTOMER && 3000 <= totalPrice) {
            deliveryFee = 0;
        } else if (customerType == GOLD_CUSTOMER && totalPrice < 3000) {
            deliveryFee = 600;
        } else if (customerType == GENERAL_CUSTOMER && 5000 <= totalPrice) {
            deliveryFee = 300;
        } else {
            deliveryFee = 900;
        }

        System.out.println("deliveryFee => " + deliveryFee);
    }
}