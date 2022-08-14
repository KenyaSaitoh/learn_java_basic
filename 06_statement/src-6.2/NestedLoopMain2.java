
public class NestedLoopMain2 {
    public static void main(String[] args) {
        int[][] scoreTable = {{80, 90, 100, 85}, {75, 70, 75, 60},  {95, 65, 75, 90},
                {90, 100, 100, 85}};
        int count = 0;
        for (int i = 0; i < scoreTable.length; i++) {
            boolean flag = false;
            SUBJECT : for (int j = 0; j < scoreTable[i].length; j++) { // ①
                if (scoreTable[i][j] == 100) {
                    flag = true;
                    break SUBJECT; // ②
                }
            }
            if (flag) count++;
        }
        System.out.println(count);
    }
}
