public class Main_NestedLoop_1 {
    public static void main(String[] args) {
        int[][] scoreTable = {{80, 90, 100, 85}, {75, 70, 75, 60}, {95, 65, 75, 90},
                {90, 100, 100, 85}};
        double maxAvg = 0;
        for (int i = 0; i < scoreTable.length; i++) {
            double sum = 0;
            for (int j = 0; j < scoreTable[i].length; j++) {
                sum += scoreTable[i][j];
            }
            double avg = sum / scoreTable[i].length; 
            if (maxAvg < avg) {
                maxAvg = avg;
            }
        }
        System.out.println(maxAvg);
    }
}