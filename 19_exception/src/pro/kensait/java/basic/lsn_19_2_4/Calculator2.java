package pro.kensait.java.basic.lsn_19_2_4;
public class Calculator2 {
    private final int initValue;
    public Calculator2(int initValue) {
        assert 100 <= initValue : "initValue is wrong value";
        this.initValue = initValue;
    }
    public int add(int param1, int param2) {
        assert 0 <= param1 && param1 <= 5 : "param1 is wrong value";
        assert 0 <= param2 && param2 <= 5 : "param2 is wrong value";
        int result = initValue + param1 * param2;
        assert 100 <= result : "result is wrong value";
        return result;
    }
}