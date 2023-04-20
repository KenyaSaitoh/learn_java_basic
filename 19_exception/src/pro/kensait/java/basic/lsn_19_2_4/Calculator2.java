package pro.kensait.java.basic.lsn_19_2_4;
public class Calculator2 {
    private final int initValue;
    public Calculator2(int initValue) {
        assert 100 <= initValue : "initValue is wrong value"; //【1】不変条件
        this.initValue = initValue;
    }
    public int add(int param1, int param2) {
        assert 0 <= param1 && param1 <= 5 : "param1 is wrong value"; //【2】事前条件
        assert 0 <= param2 && param2 <= 5 : "param2 is wrong value"; //【3】事前条件
        int result = initValue + param1 * param2;
        assert 100 <= result : "result is wrong value"; //【4】事後条件
        return result;
    }
}