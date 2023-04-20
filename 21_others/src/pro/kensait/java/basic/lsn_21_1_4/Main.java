package pro.kensait.java.basic.lsn_21_1_4;

public class Main {
    public static void main(String[] args) {
        //【1】ローカルクラスの宣言
        class CalcFunction {
            public int calc(int x, int y) {
                return x + y;
            }
        };
        CalcFunction cf = new CalcFunction(); //【2】インスタンス生成
        int answer = cf.calc(30, 10); //【3】メソッド呼び出し
        System.out.println(answer);
    }
}