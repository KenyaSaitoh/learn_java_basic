public class Main_5_1 {
    public static void main(String[] args) {
        {
            System.out.println("***** snippet_5_1_3 *****");
            int[] scores;
        }
        {
            System.out.println("***** snippet_5_1_4 *****");
            int[] scores; // 配列を宣言
            scores = new int[3]; // 配列を初期化
        }
        {
            System.out.println("***** snippet_5_1_5 *****");
            int[] scores = {650, 570, 700};
        }
        {
            System.out.println("***** snippet_5_1_6 *****");
            int[] scores = {650, 570, 700};
            int x = scores[0];
        }
        {
            System.out.println("***** snippet_5_1_7 *****");
            int[] scores = new int[3];
            scores[0] = 650;
            scores[1] = 570;
            scores[2] = 700;
        }
        {
            System.out.println("***** snippet_5_1_8 *****");
            int[] scores = {650, 570, 700};
            scores[0] = 660;
        }
        {
            System.out.println("***** snippet_5_1_9 *****");
            int[] scores = {650, 570, 700};
            System.out.println(scores.length);
        }
        {
            System.out.println("***** snippet_5_1_10 *****");
            int[] scores = {650, 570, 700};
            System.out.println(scores[3]);
        }
        {
            System.out.println("***** snippet_5_1_11 *****");
            int[][] scoreTable = {{80, 90, 100, 85}, {75, 70, 75, 60}, {95, 65, 75, 90}};
        }
        {
            System.out.println("***** snippet_5_1_12 *****");
            int[][] scoreTable = {{80, 90, 100, 85}, {75, 70, 75, 60}, {95, 65, 75, 90}};
            int[] scores = scoreTable[1];
        }
        {
            System.out.println("***** snippet_5_1_13 *****");
            int[][] scoreTable = {{80, 90, 100, 85}, {75, 70, 75, 60}, {95, 65, 75, 90}};
            int s = scoreTable[1][2];
        }
        {
            System.out.println("***** snippet_5_1_14 *****");
            int[][] scoreTable = {{80, 90, 100, 85}, {75, 70, 75, 60}, {95, 65, 75, 90}};
            int length1 = scoreTable.length; //［1］
            int length2 = scoreTable[0].length; //［2］
        }
    }
}