
public class NestedLoopMain3 {
    public static void main(String[] args) {
        int[][] scoreTable = {{80, 90, 100, 85}, {75, 70, 75, 60},  {95, 65, 75, 90},
                {90, 100, 100, 85}};
        PERSON : for (int i = 0; i < scoreTable.length; i++) { // ①
            for (int j = 0; j < scoreTable[i].length; j++) { // ①
                if (scoreTable[i][j] < 70) {
                    System.out.println("追試開催");
                    break PERSON; // ②
                }
            }
        }
    }
}