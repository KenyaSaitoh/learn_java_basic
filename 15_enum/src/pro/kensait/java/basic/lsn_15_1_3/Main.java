package pro.kensait.java.basic.lsn_15_1_3;

public class Main {
    public static void main(String[] args) {
        {
            System.out.println("***** snippet_1 *****");
            String customerTypeName = "GENERAL"; // "一般顧客"
            CustomerType ct = // "一般顧客"の列挙子が決まる
                    CustomerType.valueOf(customerTypeName);
            System.out.println(ct);
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_2 *****");
            int customerTypeNum = 1; // ゴールド会員
            CustomerType ct = null;
            for (CustomerType ct2 : CustomerType.values()) { //【1】
                if (customerTypeNum == ct2.ordinal()) { //【2】
                    ct = ct2; // ゴールド会員の列挙子が決まる
                    break;
                }
            }
            System.out.println(ct);
            System.out.println("=> end");
        }
    }
}
