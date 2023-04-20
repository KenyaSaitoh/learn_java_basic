import java.util.Scanner;

public class Main_Switch_4 {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws Exception {
        System.out.print("customerType? (0:GENERAL, 1:GOLD, 2:PLATINUM, 3:DIAMOND) => ");
        int customerType = Integer.parseInt(new Scanner(System.in).nextLine());
        int deliveryFee = switch (customerType) { //【1】
        case 0, 1 -> 900; //【2】
        case 2 -> 600; //【3】
        case 3 -> { //【4】
            System.out.println("ダイヤモンド会員の場合");
            yield 0;
        }
        default -> { //【5】
            // 例外の送出など
            throw new IllegalArgumentException("不正な顧客種別");
        }
        }; //【6】
        System.out.println("deliveryFee => " + deliveryFee);
    }
}