public class Main_3_2 {
    public static void main(String[] args) {
        {
            System.out.println("***** snippet_1 *****");
            int x1 = 200; // 10進数リテラル
            int x2 = 0xC8; // 16進数リテラル
            int x3 = 0b11001000; // 2進数リテラル
            int x4 = 0310; // 8進数リテラル
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_2 *****");
            double d1 = 123.4567; // 整数部と小数部の組み合わせによる表記
            double d2 = 0.1234567e3; // 指数表現
            double d3 = .1234567e3; // 指数表現（先頭の0は省略可能）
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_3 *****");
            int x1 = 1234567;
            int x2 = 1_234_567;
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_4 *****");
            double d1 = 123.456_7; // 整数部と小数部による表記
            double d2 = .1_234_567e3; // 指数表現
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_5 *****");
            char c = 'ア';
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_6 *****");
            String str = "foo";
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_7 *****");
            String str = "a\tb";
            System.out.println(str);
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_8 *****");
            String str = "\'foo\'";
            System.out.println(str);
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_9 *****");
            String str1 = "こんにちは！私はAlice、25歳です。日本語を話せます。"; //【1】
            String str2 = "こんにちは！私はAlice、25歳です。" + //【2】
                    "日本語を話せます。";
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_10 *****");
            //String str = "こんにちは！私はAlice、25歳です。
            //        日本語を話せます。"; // コンパイルエラー
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_11 *****");
            String str = "こんにちは！私はAlice、25歳です。\n日本語を話せます。";
            System.out.println("=> end");
        }
    }
}