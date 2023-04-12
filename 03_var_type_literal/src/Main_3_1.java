public class Main_3_1 {
    public static void main(String[] args) {
        {
            System.out.println("***** snippet_1 *****");
            int x;
        }
        {
            System.out.println("***** snippet_2 *****");
            int x, y, z;
        }
        {
            System.out.println("***** snippet_3 *****");
            int x;
            x = 10;
        }
        {
            System.out.println("***** snippet_4 *****");
            int x = 10;
        }
        {
            System.out.println("***** snippet_5 *****");
            int x = 10, y = 20, z = 30;
        }
        {
            System.out.println("***** snippet_6 *****");
            int x = 10;
            x = 20; // 変数xに20が格納される
        }
        {
            System.out.println("***** snippet_7 *****");
            int x = 10, y = 20;
            int result = x + y;
            System.out.println(result);
        }
        {
            System.out.println("***** snippet_8 *****");
            byte x = 100;
            x += 300; // コンパイルエラー発生せず
        }
        {
            System.out.println("***** snippet_9 *****");
            double d1 = 0.1 + 0.2;
            double d2 = 0.3;
            if (d1 == d2) {} // この判定はfalseになる
        }
        {
            System.out.println("***** snippet_10 *****");
            boolean flag = true; // またはfalse
        }
        {
            System.out.println("***** snippet_11 *****");
            int x = 10, y = 15;
            boolean flag = y == x + 5;
        }
        {
            System.out.println("***** snippet_12 *****");
            char c1 = 'ア';
            char c2 = 0x30A2;
            char c3 = 12450;
        }
        {
            System.out.println("***** snippet_13 *****");
            String str = "foo";
        }
    }
}