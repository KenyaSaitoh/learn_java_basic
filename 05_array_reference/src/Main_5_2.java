public class Main_5_2 {
    public static void main(String[] args) {
        {
            System.out.println("***** snippet_1 *****");
            int[] scores = {650, 570, 700};
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_2 *****");
            int[] scores = {650, 570, 700};
            int[] scores2 = scores; // 配列から配列に代入する
            scores2[0] = 660; // 代入先の値を書き換える
            System.out.println(scores[0]); // 代入元はどうなる？
            System.out.println("=> end");
        }
    }
}