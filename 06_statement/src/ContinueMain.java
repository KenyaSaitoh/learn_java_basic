
public class ContinueMain {
    public static void main(String[] args) {
        int sum = 0; // ①
        for (int i = 0; i < 10; i++) {
            int num = i + 1;
            if (num % 3 == 0) {
                continue;
            }
            sum += i + 1;
        }
        System.out.println(sum);
    }
}
