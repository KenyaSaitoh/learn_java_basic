package pro.kensait.java.nestedclass.anonymous;

public class ClosureMain {

    public static void main(String[] args) {

        int base = 100; // ローカル変数［①］

        // 匿名クラスのインスタンスを生成する［②］
        CalcFunction cf1 = new CalcFunction() {
            @Override
            public int calc(int x, int y) {
                return base + x + y;
            }
        };

        // ラムダ式[③]
        CalcFunction cf2 = (int x, int y) -> {
            return base + x + y;
        };

        // base += 20;
        Processor p = new Processor();
        p.process(cf1);
        p.process(cf2);
    }
}
