package pro.kensait.java.nestedclass.anonymous;

public class CalcMain {

    public static void main(String[] args) {
        // 匿名クラスのインスタンスを生成する【①】
    	CalcFunction calc = new CalcFunction() {
            @Override
            public int calc(int a, int b) {
                return a + b;
            }
        };
        int answer = calc.calc(30, 10); // インスタンス生成【②】
        System.out.println(answer); // メソッド呼び出し【③】

        // ラムダ式
        CalcFunction calc2 = (a, b) -> {
            return a + b;
        };
        int answer2 = calc2.calc(30, 10);
        System.out.println(answer2);
    }
}

/* ======================================== */
interface CalcFunction {
    int calc(int x, int y);
}
