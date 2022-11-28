package pro.kensait.java.basic.lesson15_1_2;

public class Main1 {
    public static void main(String[] args) {
        Customer alice = new Customer(1, "Alice", CustomerType.PLATINUM);
        if (alice.getCustomerType() == CustomerType.PLATINUM) {
            System.out.println("プラチナ会員です");
        }
        if (CustomerType.GOLD.ordinal() <= alice.getCustomerType().ordinal()) {
            System.out.println("ゴールド会員以上です");
        }
    }
}
