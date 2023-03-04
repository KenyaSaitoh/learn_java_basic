import java.util.Scanner;

public class Main_If_2 {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws Exception {
        System.out.print("totalPrice? => ");
        int totalPrice = Integer.parseInt(new Scanner(System.in).nextLine());

        int deliveryFee;
        if (10000 <= totalPrice) {
            deliveryFee = 300;
        } else if (5000 <= totalPrice) {
            deliveryFee = 600;
        } else {
            deliveryFee = 900;
        }

        System.out.println("deliveryFee => " + deliveryFee);
    }
}