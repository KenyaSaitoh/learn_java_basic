package pro.kensait.java.basic.lsn_19_2_4;
public class Calculator3 {
    private final int initValue;
    public Calculator3(int initValue) {
        if (initValue < 100)
            throw new IllegalArgumentException("initValue is wrong value");
        this.initValue = initValue;
    }
    public int add(int param1, int param2) {
        if (! (0 <= param1 && param1 <= 5))
            throw new IllegalArgumentException("param1 is wrong value");
        if (! (0 <= param2 && param2 <= 5))
            throw new IllegalArgumentException("param2 is wrong value");
        int result = initValue + param1 * param2;
        return result;
    }
}