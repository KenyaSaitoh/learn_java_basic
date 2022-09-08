package pro.kensait.java.nestedclass.local;

public class CalcMain2 {

    public static void main(String[] args) {
    	new CalcMain2().process(20);
    }

    int a = 10; // エンクロージングクラスのフィールド
    void process (int b) { // メソッド引数（暗黙的にfinal)
    	int c = 30; // ローカル変数（暗黙的にfinal)
        class CalcFunction { // ローカルクラス
            private int d; // ローカルクラス内フィールド
            public CalcFunction(int d) { // コンストラクタ
				this.d = d;
			}
			public int calc(int e) { // メソッド
                return a + b + c + d + e;
            }
        };
        CalcFunction cf = new CalcFunction(40);
        int answer1 = cf.calc(50); // 150が格納される
        int answer2 = cf.calc(60); // 160が格納される
        System.out.println(answer1);
        System.out.println(answer2);
    }
}
