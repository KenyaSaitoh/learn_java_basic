public class Main_3_3 {
    public static void main(String[] args) {
        {
            System.out.println("***** snippet_1 *****");
            int x = 10;
            int y = x; // 変数yに10が代入される
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_2 *****");
            String str1 = "foo";
            String str2 = str1; // 変数str2の文字列は"foo"
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_3 *****");
            int x = 10;
            int y = x; // 変数yに10が代入される
            x = 20;
            System.out.println(y); // どうなる？
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_4 *****");
            String str1 = "foo";
            String str2 = str1; // 変数str2の文字列は"foo"
            str1 = "bar";
            System.out.println(str2); // どうなる？
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_5 *****");
            //int x = "abc"; // 文字列をint型に代入
            //String str = 10; // 数値をString型に代入
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_6 *****");
            int x = 100;
            long y = x;
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_7 *****");
            float f = 12345.67F;
            double d = f;
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_8 *****");
            int x = 100;
            // short y = x; // コンパイルエラー
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_9 *****");
            int x = 100;
            short y = (short) x; // コンパイルエラーは解消
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_10 *****");
            int x = 400;
            byte y = (byte) x;
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_11 *****");
            double d = 12345.67;
            int x = (int) d;
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_12 *****");
            long x = 100;
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_13 *****");
            // long x = 3_000_000_000; // リテラル30億はint型の範囲外
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_14 *****");
            long x = 3_000_000_000L;
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_15 *****");
            float f = 12345.67F;
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_16 *****");
            var x = 10; // int型と推論される
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_17 *****");
            var d = 12345.67; // double型と推論される
            var str = "foo"; // String型と推論される
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_18 *****");
            //var x; // コンパイルエラー
            //var x = 10, y = 20; // コンパイルエラー
            System.out.println("=> end");
        }
    }
}