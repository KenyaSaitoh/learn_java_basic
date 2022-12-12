public class Main_Average_2 {
    public static void main(String[] args) {
        int[] scores = {650, 570, 700};
        int sum = 0;
        for (int score : scores) { //［1］
            sum += score; //［2］
        }
        int average = sum / scores.length;
    }
}