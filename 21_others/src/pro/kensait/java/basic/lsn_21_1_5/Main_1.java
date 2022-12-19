package pro.kensait.java.basic.lsn_21_1_5;

public class Main_1 {
    public static void main(String[] args) {
        // 匿名クラスのインスタンスを生成する
        CalcFunction cf = new CalcFunction() {
            @Override
            public int calc(int x, int y) {
                return x + y;
            }
        };
        int answer = cf.calc(30, 10); // インスタンス生成
        System.out.println(answer); // メソッド呼び出し
    }
}
