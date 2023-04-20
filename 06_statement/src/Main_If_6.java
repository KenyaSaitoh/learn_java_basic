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
        if (customerType == GOLD_CUSTOMER) { //【1】ゴールド会員の場合
            if (3000 <= totalPrice) { //【2】購入金額3000円以上の場合
                deliveryFee = 0;
            } else { //【3】購入金額3000円未満の場合
                deliveryFee = 600;
            }
        } else { // 【4】一般会員の場合
            deliveryFee = 600;
        }

        System.out.println("deliveryFee => " + deliveryFee);
    }
}