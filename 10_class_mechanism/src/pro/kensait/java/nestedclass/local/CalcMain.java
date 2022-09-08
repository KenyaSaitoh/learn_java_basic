package pro.kensait.java.nestedclass.local;

public class CalcMain {

    public static void main(String[] args) {
    	// ローカルクラス
        class CalcFunction {
            public int calc(int x, int y) {
                return x + y;
            }
        };
        CalcFunction cf = new CalcFunction();
        int answer = cf.calc(30, 10);
        System.out.println(answer);
    }

}