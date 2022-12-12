package pro.kensait.java.basic.lesson19_2_4.assertion;
public class Calculator2 {
    private final int initValue;
    public Calculator2(int initValue) {
        if (100 <= initValue)
            throw new IllegalArgumentException("initValue is wrong value");
        this.initValue = initValue;
    }
    public int add(int param1, int param2) {
        if (0 <= param1 && param1 <= 5)
            throw new IllegalArgumentException("param1 is wrong value");
        if (0 <= param2 && param2 <= 5)
            throw new IllegalArgumentException("param2 is wrong value");
        int result = initValue + param1 * param2;
        return result;
    }
}