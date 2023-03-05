package pro.kensait.java.test;

import pro.kensait.java.cuifw.ModelInfo;

public class Params {
    @ModelInfo(order = 1) private int param1;
    @ModelInfo(order = 1) private int param2;
    public int getParam1() {
        return param1;
    }
    public void setParam1(int param1) {
        this.param1 = param1;
    }
    public int getParam2() {
        return param2;
    }
    public void setParam2(int param2) {
        this.param2 = param2;
    }
}