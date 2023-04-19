public class Main_6_2 {
    @SuppressWarnings("unused")
    public static void main(String[] args) throws Exception {
        // 変数セットアップ
        int customerType = 0;
        int GENERAL_CUSTOMER = 0;
        int GOLD_CUSTOMER = 1;
        int point = 0;

        {
            System.out.println("***** snippet_1 *****");
            if (customerType == GOLD_CUSTOMER) {
                point += 100;
            }
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_2 *****");
            boolean isGoldCustomer = true; // またはfalse
            if (isGoldCustomer) {
                point += 100;
            }
            System.out.println("=> end");
        }
    }
}