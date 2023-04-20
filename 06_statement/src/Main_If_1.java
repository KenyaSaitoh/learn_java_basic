import java.util.Scanner;

public class Main_If_1 {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws Exception {
        System.out.print("totalPrice? => ");
        int totalPrice = Integer.parseInt(new Scanner(System.in).nextLine());

        int deliveryFee; //【1】配送料
        if (10000 <= totalPrice) { //【2】
            deliveryFee = 300; //【3】
        } else {
            deliveryFee = 900; //【4】
        }

        System.out.println("deliveryFee => " + deliveryFee);
    }
}