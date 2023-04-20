public class Main_Recursive {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int sum = calcSum(array, 0);
        System.out.println(sum);
    }

    static int calcSum(int[] array, int i) {
        if (i < array.length) {
            return array[i] + calcSum(array, ++i); //【1】
        } else {
            return 0;
        }
    }
}
