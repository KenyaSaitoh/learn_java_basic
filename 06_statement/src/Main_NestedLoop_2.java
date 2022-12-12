public class Main_NestedLoop_2 {
    public static void main(String[] args) {
        int[][] scoreTable = {{80, 90, 100, 85}, {75, 70, 75, 60}, {95, 65, 75, 90},
                {90, 100, 100, 85}};
        int count = 0;
        for (int i = 0; i < scoreTable.length; i++) {
            boolean hasFullScore = false;
            for (int j = 0; j < scoreTable[i].length; j++) { //［1］
                if (scoreTable[i][j] == 100) {
                    hasFullScore = true;
                    break; //［2］
                }
            }
            if (hasFullScore) count++;
        }
        System.out.println(count);
    }
}