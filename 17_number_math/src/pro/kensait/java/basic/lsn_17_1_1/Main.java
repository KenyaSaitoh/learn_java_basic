package pro.kensait.java.basic.lsn_17_1_1;

public class Main {
    public static void main(String[] args) {
        int x = 30;
        Integer value = x; //【1】オートボクシング
        int y = value; //【2】オートアンボクシング
        System.out.println(y);
    }
}