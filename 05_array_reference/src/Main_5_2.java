public class Main_5_2 {
    public static void main(String[] args) {
        {
            System.out.println("***** snippet1 *****");
            int[] scores = {650, 570, 700};
            int[] scores2 = scores; // 配列から配列に代入する
            scores[0] = 660; // 代入元の値を書き換える
            System.out.println(scores2[0]); // 代入先はどうなる？
        }
    }
}