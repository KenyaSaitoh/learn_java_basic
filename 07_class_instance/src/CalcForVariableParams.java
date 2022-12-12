class CalcForVariableParams {
    int add(int... params) {
        int sum = 0;
        for (int i = 0; i < params.length; i++) {
            sum += params[i];
        }
        return sum; // 合計を算出して返す
    }
}