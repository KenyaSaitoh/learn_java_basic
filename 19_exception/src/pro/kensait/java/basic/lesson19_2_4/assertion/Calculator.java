package pro.kensait.java.basic.lesson19_2_4.assertion;
public class Calculator {
    private final int initValue;
    public Calculator(int initValue) {
        this.initValue = initValue;
    }
    public int add(int param1, int param2) {
        int result = initValue + param1 * param2;
        return result;
    }
}