class Main_NewPage {
    private static final int MAX_LINE_PER_PAGE = 30;
    public static void main(String[] args) {
        int[] array = new int[100];
        for (int i = 0; i < 100; i++) {
            array[i] = i + 1;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            if ((i + 1) % MAX_LINE_PER_PAGE == 0)
                System.out.println("改ページ");
        }
    }
}