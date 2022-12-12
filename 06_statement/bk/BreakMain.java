
public class BreakMain {
    public static void main(String[] args) {
        int[] nums = {8, 5, 10, 12, 1, 9}; // ①
        boolean b = false;
        for (int i = 0; i < 10; i++) {
            if (nums[i] % 3 == 0) {
                b = true;
                break;
            }
        }
        System.out.println(b);
    }
}
