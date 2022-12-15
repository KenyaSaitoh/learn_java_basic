public class Main_3_1 {
    public static void main(String[] args) {
        {
            System.out.println("***** snippet_3_1_1 *****");
            int x;
        }
        {
            System.out.println("***** snippet_3_1_2 *****");
            int x, y, z;
        }
        {
            System.out.println("***** snippet_3_1_3 *****");
            int x;
            x = 10;
        }
        {
            System.out.println("***** snippet_3_1_4 *****");
            int x = 10;
        }
        {
            System.out.println("***** snippet_3_1_5 *****");
            int x = 10, y = 20, z = 30;
        }
        {
            System.out.println("***** snippet_3_1_6 *****");
            int x = 10;
            x = 20; // 変数xに20が代入される
        }
        {
            System.out.println("***** snippet_3_1_7 *****");
            int x = 10, y = 20; //［1］
            int result = x + y; //［2］
            System.out.println(result); //［3］
        }
    }
}