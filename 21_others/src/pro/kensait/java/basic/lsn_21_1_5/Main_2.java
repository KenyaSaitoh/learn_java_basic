package pro.kensait.java.basic.lsn_21_1_5;

public class Main_2 {
    public static void main(String[] args) {
        int base = 100; //【1】ローカル変数
        // 匿名クラスのインスタンスを生成する
        CalcFunction cf = new CalcFunction() {
            @Override
            public int calc(int x, int y) {
                return base + x + y; //【2】
            }
        };
        int answer = cf.calc(30, 10); //【3】
        System.out.println(answer);
    }
}
