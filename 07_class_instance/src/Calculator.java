class Calculator {

    int add(int x, int y) {
        int result = x + y;
        return result;
    }

    int subtract(int x, int y) {
        int result = x - y;
        return result;
    }

    int add(int x, int y, int z) {
        int result = x + y + z;
        return result;
    }

    int add(int[] params) {
        int sum = 0;
        for (int i = 0; i < params.length; i++) {
            sum += params[i];
        }
        return sum;
    }

    /* オーバーロードにならない
    double add(int x, int y) {
        double result = x + y;
        return result;
    }
    */
}