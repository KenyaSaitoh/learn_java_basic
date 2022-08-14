class Calculator2 {

    int add(int x, int y) {
        int result = x + y;
        showResult(result);
        return result;
    }

    int subtract(int x, int y) {
        int result = x - y;
        showResult(result);
        return result;
    }

    // 共通処理をメソッド化
    void showResult(int result) {
        System.out.println("計算結果 => ," + result);
    }
}