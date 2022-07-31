
public class ContinueMain2 {
    public static void main(String[] args) {
        int sum = 0; // ①
        for (int i = 0; i < 10; i++) {
            int num = i + 1;
            if (num % 3 != 0) {
                sum += i + 1;
            }
            // 何らかの後続処理
        }
        System.out.println(sum);
    }
}
