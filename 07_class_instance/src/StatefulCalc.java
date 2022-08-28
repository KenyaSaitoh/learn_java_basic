class StatefulCalc {
    int x;
    int y;

    public StatefulCalc(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int add() {
        int result = x + y;
        return result;
    }

    int subtract() {
        int result = x - y;
        return result;
    }
}