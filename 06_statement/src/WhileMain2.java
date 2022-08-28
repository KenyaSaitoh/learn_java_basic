
public class WhileMain2 {
    public static void main(String[] args) {
        int total = 1; // ①
        while (total < 10000) { // ②
            total = total * 5;
        }
        System.out.println(total);
    }
}
