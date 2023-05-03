public class Main_5_1 {
    public static void main(String[] args) {
        {
            System.out.println("***** snippet_1 *****");
            int[] scores;
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_2 *****");
            int[] scores; // 配列を宣言
            scores = new int[3]; // 配列を初期化
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_3 *****");
            int[] scores = {650, 570, 700};
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_4 *****");
            int[] scores = {650, 570, 700};
            int x = scores[0];
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_5 *****");
            int[] scores = new int[3];
            scores[0] = 650;
            scores[1] = 570;
            scores[2] = 700;
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_6 *****");
            int[] scores = {650, 570, 700};
            scores[0] = 660;
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_7 *****");
            int[] scores = {650, 570, 700};
            int lgh = scores.length; // 3
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_8 *****");
            int[] scores = {650, 570, 700};
            int x = scores[3];
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_9 *****");
            int[][] scoreTable = {{80, 90, 100, 85}, {75, 70, 75, 60}, {95, 65, 75, 90}};
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_10 *****");
            int[][] scoreTable = {{80, 90, 100, 85}, {75, 70, 75, 60}, {95, 65, 75, 90}};
            int[] scores = scoreTable[1];
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_11 *****");
            int[][] scoreTable = {{80, 90, 100, 85}, {75, 70, 75, 60}, {95, 65, 75, 90}};
            int s = scoreTable[1][2];
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_12 *****");
            int[][] scoreTable = {{80, 90, 100, 85}, {75, 70, 75, 60}, {95, 65, 75, 90}};
            int lgt1 = scoreTable.length; //【1】
            int lgt2 = scoreTable[0].length; //【2】
            System.out.println("=> end");
        }
    }
}