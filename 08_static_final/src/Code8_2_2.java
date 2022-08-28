public class Code8_2_2 {
    private static final int MAX_LINE_PER_PAGE = 30;
    public static void main(String[] args) {
        int[] array = new int[100];
        for (int val = 1; val < 101; val++) {
            array[val - 1] = val;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            if ((i + 1) % MAX_LINE_PER_PAGE == 0)
                System.out.println("改ページ");
        }
        String aaa = new java.lang.String("aa");
    }
}