
public class RecursiveMain {

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int sum = calc(array, 0);
        System.out.println(sum);
        int sum2 = calc(array);
        System.out.println(sum2);
    }

    // こっちは変数sumが不要。よりリカーシブっぽい。
    private static int calc(int[] array, int i) {
        if (i < array.length) {
            return array[i] + calc(array, ++i);
        } else {
            return 0;
        }
    }
    
    private static int calc(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
}
