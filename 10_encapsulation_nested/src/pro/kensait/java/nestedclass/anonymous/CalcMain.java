package pro.kensait.java.nestedclass.anonymous;

public class CalcMain {

    public static void main(String[] args) {
    	//
        class CalcFunction2 {
            public int calc(int x, int y) {
                return x + y;
            }
        };
        CalcFunction2 calc = new CalcFunction2();
        int answer1 = calc.calc(30, 10);
        System.out.println(answer1);

        // 匿名クラス
    	CalcFunction calc2 = new CalcFunction() {
            @Override
            public int calc(int x, int y) {
                return x + y;
            }
        };
        int answer2 = calc2.calc(30, 10);
        System.out.println(answer2);

        // ラムダ式
        CalcFunction calc3 = (int x, int y) -> {
            return x + y;
        };
        int answer3 = calc3.calc(30, 10);
        System.out.println(answer3);
    }
}

/* ======================================== */
interface CalcFunction {
    int calc(int x, int y);
}
