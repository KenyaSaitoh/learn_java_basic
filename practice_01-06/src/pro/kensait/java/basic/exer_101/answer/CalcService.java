package pro.kensait.java.basic.exer_101.answer;

import java.math.BigDecimal;

import pro.kensait.java.cuifw.ConsoleMenu;
import pro.kensait.java.cuifw.ParamInfo;
import pro.kensait.java.cuifw.Question;

public class CalcService {
    @Question("""
    引数x、y、zの合計値を求めなさい。
    """)
    @ConsoleMenu(order = 1)
    public int calc01(
            @ParamInfo(order = 1, name = "x") int x,
            @ParamInfo(order = 2, name = "y") int y,
            @ParamInfo(order = 3, name = "z") int z) {
        int result = x + y + z;
        return result;
    }

    @Question("""
    引数x、y、zの平均値を求め、double型で返しなさい。
    """)
    @ConsoleMenu(order = 2)
    public double calc02(
            @ParamInfo(order = 1, name = "x") int x,
            @ParamInfo(order = 2, name = "y") int y,
            @ParamInfo(order = 3, name = "z") int z) {
        double result = (x + y + z) / 3;
        return result;
    }
    
    @Question("""
    引数x、yの合計値が、引数zと一致しているかどうかを求め、boolean型で返しなさい。
    """)
    @ConsoleMenu(order = 13)
    public boolean calc13(
            @ParamInfo(order = 1, name = "x") double x,
            @ParamInfo(order = 2, name = "y") double y,
            @ParamInfo(order = 3, name = "z") double z) {
        BigDecimal b1 = BigDecimal.valueOf(x);
        BigDecimal b2 = BigDecimal.valueOf(y);
        BigDecimal b3 = BigDecimal.valueOf(z);
        BigDecimal sum = b1.add(b2);
        if (sum.equals(b3)) {
            return true;
        }
        return false;
        /*
        double sum = x + y;
        if (sum == z) {
            return true;
        }
        return false;
        */
    }

    @Question("""
    引数xをyで除算し、その結果をdouble型で返しなさい。
    """)
    @ConsoleMenu(order = 3)
    public double calc03(
            @ParamInfo(order = 1, name = "x") int x,
            @ParamInfo(order = 2, name = "y") int y) {
        // これはNG
        // double result = x / y;
        double d1 = x;
        double d2 = y;
        double val = d1 / d2;
        return val;
    }

    @Question("""
    引数xとyを比較し、yの方が大きい場合はtrueを返しなさい。
    """)
    @ConsoleMenu(order = 4)
    public boolean calc04(
            @ParamInfo(order = 1, name = "x") int x,
            @ParamInfo(order = 2, name = "y") int y) {
        boolean flag = x < y;
        return flag;
    }

    @Question("""
    引数xが100より大きく、かつ5の倍数のときにtrueを返しなさい。
    """)
    @ConsoleMenu(order = 5)
    public boolean calc05(
            @ParamInfo(order = 1, name = "x") int x) {
        boolean flag = 100 < x && x % 5 == 0;
        return flag;
    }

    @Question("""
    引数xが100より小さいか、または8の倍数のときにtrueを返しなさい。
    """)
    @ConsoleMenu(order = 6)
    public boolean calc06(
            @ParamInfo(order = 1, name = "x") int x) {
        boolean flag = x < 100 || x % 8 == 0;
        return flag;
    }

    @Question("""
    引数nameとageから「Hello! 私はname、age歳です。」という文字列を返しなさい。
    """)
    @ConsoleMenu(order = 4)
    public String sayHello01(
            @ParamInfo(order = 1, name = "名前") String name,
            @ParamInfo(order = 2, name = "年齢") int age) {
        String result = "Hello! 私は" + name + "、" + age + "歳です。";
        return result;
    }
    
    @ConsoleMenu(order = 20)
    public void f() {
    }
    
    @ConsoleMenu(order = 21)
    public void f2() {
    }
}
