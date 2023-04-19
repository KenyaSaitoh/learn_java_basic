public class Main_4_1 {
    public static void main(String[] args) {
        {
            System.out.println("***** snippet_1 *****");
            int x = 30;
            int y = x + 10;
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_2 *****");
            int x = 10;
            double y = x * 0.03;
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_3 *****");
            int x = 100;
            double y = x * 0.1;
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_4 *****");
            int x = 5 / 2;
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_5 *****");
            double d = 5 / 2;
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_6 *****");
            double d1 = 5;
            double d2 = 2;
            double val = d1 / d2;
            double val2 = (double) 5 / (double) 2;
            System.out.println(val);
            System.out.println(val2);
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_7 *****");
            double val1 = 5.0 / 2.0;
            double val2 = 5.0 / 2;
            double val3 = 5 / 2.0;
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_8 *****");
            int x = 100;
            //int y = (int) x * 0.1; // コンパイルエラー
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_9 *****");
            int x = 100;
            int y = (int) (x * 0.1);
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_10 *****");
            int i = 10;
            int x = i++;
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_11 *****");
            String str = "Hello, " + "World!";
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_12 *****");
            String str1 = "abc" + 100;
            String str2 = 100 + "abc";
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_13 *****");
            int x = 10;
            x += 5;
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_14 *****");
            int x = 10, y = 15;
            boolean flag1 = y == x + 5; // trueが返る
            boolean flag2 = x == y; // falseが返る
            boolean flag3 = x != y; // trueが返る
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_15 *****");
            int x = 10, y = 15;
            boolean flag1 = x < y; // trueが返る
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_16 *****");
            int x = 10;
            boolean flag = (x <= 15) && (x % 2 == 0); // trueが返る
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_17 *****");
            int x = 20;
            boolean flag = (x <= 15) || (x % 2 == 0); // trueが返る
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_18 *****");
            int x = 10;
            boolean flag = ! (x == 20);
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_19 *****");
            int x = 20;
            boolean flag = x <= 15 ^ x % 2 == 0; // trueが返る
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_20 *****");
            int x = 20;
            boolean flag = (x <= 15) && (x % 2 == 0); // falseが返る
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_21 *****");
            int x = 10;
            boolean flag = (x <= 15) || (x % 2 == 0); // trueが返る
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_22 *****");
            int x = 12 & 5;
            System.out.println(x);
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_23 *****");
            int x = 12 | 5;
            System.out.println(x);
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_24 *****");
            int x = 12 ^ 5;
            System.out.println(x);
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_25 *****");
            int x = ~4;
            System.out.println(x);
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_26 *****");
            int x = 13 >> 2;
            System.out.println(x);
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_27 *****");
            byte x = (byte) (-77 >>> 2);
            System.out.println(x);
            System.out.println("=> end");
        }
    }
}