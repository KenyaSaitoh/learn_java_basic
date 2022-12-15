public class Main_4_1 {
    public static void main(String[] args) {
        {
            System.out.println("***** snippet_4_1_1 *****");
            int x = 10;
            int y = x + 10;
        }
        {
            System.out.println("***** snippet_4_1_2 *****");
            int x = 10;
            double y = x * 0.03;
        }
        {
            System.out.println("***** snippet_4_1_3 *****");
            int x = 100;
            double y = x * 0.1;
        }
        {
            System.out.println("***** snippet_4_1_4 *****");
            int x = 5 / 2;
        }
        {
            System.out.println("***** snippet_4_1_5 *****");
            double d = 5 / 2;
        }
        {
            System.out.println("***** snippet_4_1_6 *****");
            double d1 = 5.0 / 2.0; //［1］
            double d2 = 5.0 / 2; //［2］
            double d3 = 5 / 2.0; // ［3］
        }
        {
            System.out.println("***** snippet_4_1_7 *****");
            int x = 100;
            //int y = (int) x * 0.1; // コンパイルエラー
        }
        {
            System.out.println("***** snippet_4_1_8 *****");
            int x = 100;
            int y = (int) (x * 0.1);
        }
        {
            System.out.println("***** snippet_4_1_9 *****");
            int i = 10;
            int x = i++;
        }
        {
            System.out.println("***** snippet_4_1_10 *****");
            String str = "Hello, " + "World!";
        }
        {
            System.out.println("***** snippet_4_1_11 *****");
            String str1 = "abc" + 100;
            String str2 = 100 + "abc";
        }
        {
            System.out.println("***** snippet_4_1_12 *****");
            int x = 10;
            x += 5;
        }
        {
            System.out.println("***** snippet_4_1_13 *****");
            int x = 10, y = 15;
            boolean flag1 = y == x + 5; // trueが返る
            boolean flag2 = x == y; // falseが返る
            boolean flag3 = x != y; // trueが返る
        }
        {
            System.out.println("***** snippet_4_1_14 *****");
            int x = 10, y = 15;
            boolean flag1 = x < y; // trueが返る
        }
        {
            System.out.println("***** snippet_4_1_15 *****");
            int x = 10;
            boolean flag = (x <= 15) && (x % 2 == 0); // trueが返る
        }
        {
            System.out.println("***** snippet_4_1_16 *****");
            int x = 20;
            boolean flag = (x <= 15) || (x % 2 == 0); // trueが返る
        }
        {
            System.out.println("***** snippet_4_1_17 *****");
            int x = 10;
            boolean flag = ! (x == 20);
        }
        {
            System.out.println("***** snippet_4_1_18 *****");
            int x = 20;
            boolean flag = x <= 15 ^ x % 2 == 0; // trueが返る
        }
        {
            System.out.println("***** snippet_4_1_19 *****");
            int x = 20;
            boolean flag = (x <= 15) && (x % 2 == 0); // falseが返る
        }
        {
            System.out.println("***** snippet_4_1_20 *****");
            int x = 10;
            boolean flag = (x <= 15) || (x % 2 == 0); // trueが返る
        }
    }
}