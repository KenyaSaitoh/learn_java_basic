package pro.kensait.java.basic.lsn_11_1_1.case_1;

public class Bar extends Foo { //【4】
    public int y; //【5】追加
    public int subtract() { //【6】追加
        return base - x - y;
    }
}