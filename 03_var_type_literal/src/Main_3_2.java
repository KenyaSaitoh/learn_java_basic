public class Main_3_2 {
    public static void main(String[] args) {
        {
            System.out.println("***** snippet_3_2_1 *****");
            //byte x = 400; // コンパイルエラー
        }
        {
            System.out.println("***** snippet_3_2_2 *****");
            byte x = 100;
            x += 300; // コンパイルエラー発生せず
        }
        {
            System.out.println("***** snippet_3_2_3 *****");
            double d1 = 0.1 + 0.2;
            double d2 = 0.3;
            if (d1 == d2) {} // この判定はfalseになる［1］
        }
        {
            System.out.println("***** snippet_3_2_4 *****");
            boolean flag = true; // またはfalse
        }
        {
            System.out.println("***** snippet_3_2_5 *****");
            int x = 10, y = 15;
            boolean flag = y == x + 5;
        }
        {
            System.out.println("***** snippet_3_2_6 *****");
            char c1 = 'ア'; //［1］
            char c2 = 0x30A2; //［2］
            char c3 = 12450; //［3］
        }
        {
            System.out.println("***** snippet_3_2_7 *****");
            String str = "foo";
        }
    }
}