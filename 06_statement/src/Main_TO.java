import java.util.Scanner;

public class Main_TO {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws Exception {
        System.out.print("totalPrice? => ");
        int totalPrice = Integer.parseInt(new Scanner(System.in).nextLine());
        int deliveryFee = 10000 <= totalPrice ? 300 : 900;
        System.out.println("deliveryFee => " + deliveryFee);
    }
}