package pro.kensait.java.basic.lsn_15_1_2;

public class Main {
    public static void main(String[] args) {
        {
            System.out.println("***** snippet_1 *****");
            CustomerType ct = CustomerType.DIAMOND;
            System.out.println(ct.name()); // "DIAMOND"
            System.out.println(ct.ordinal()); // 3
            System.out.println(ct.toString()); // "DIAMOND"
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_2 *****");
            Customer alice = new Customer(1, "Alice", CustomerType.PLATINUM);
            if (alice.getCustomerType() == CustomerType.PLATINUM) {
                System.out.println("プラチナ会員です");
            }
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_3 *****");
            Customer alice = new Customer(1, "Alice", CustomerType.PLATINUM);
            if (CustomerType.GOLD.ordinal() <= alice.getCustomerType().ordinal()) {
                System.out.println("ゴールド会員以上です");
            }
            System.out.println("=> end");
        }
    }
}
