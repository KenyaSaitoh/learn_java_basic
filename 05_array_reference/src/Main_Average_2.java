public class Main_Average_2 {
    public static void main(String[] args) {
        int[] scores = {650, 570, 700}; //【1】
        double sum = 0; //【2】
        for (int i = 0; i < scores.length; i++) { //【3】
            sum += scores[i]; //【4】
        }
        double avg = sum / scores.length;//【5】
        System.out.println(avg);
    }
}