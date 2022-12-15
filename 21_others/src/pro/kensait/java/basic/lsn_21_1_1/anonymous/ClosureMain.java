package pro.kensait.java.basic.lsn_21_1_1.anonymous;

public class ClosureMain {

    public static void main(String[] args) {

        int base = 100; // ローカル変数［1］

        // 匿名クラスのインスタンスを生成する［2］
        CalcFunction cf1 = new CalcFunction() {
            @Override
            public int calc(int a, int b) {
                return base + a + b;
            }
        };

        // ラムダ式[③]
        CalcFunction cf2 = (x, y) -> {
            return base + x + y;
        };

        // base += 20;
        Processor p = new Processor();
        p.process(cf1);
        p.process(cf2);
    }
}
