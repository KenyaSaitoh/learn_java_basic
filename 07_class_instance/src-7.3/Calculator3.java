class Calculator3 {
    int x;
    int y;

    public Calculator3(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int add() {
        int result = this.x + this.y;
        return result;
    }

    int subtract() {
        int result = this.x - this.y;
        return result;
    }
}