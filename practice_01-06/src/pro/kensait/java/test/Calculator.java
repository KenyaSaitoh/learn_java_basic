package pro.kensait.java.test;

import java.math.BigDecimal;

import pro.kensait.java.cuifw.ConsoleMenu;
import pro.kensait.java.cuifw.ParamInfo;

public class Calculator {
    @ConsoleMenu(order = 1, title = "足し算")
    public int add(
            @ParamInfo(order = 1, name = "第一引数") int x,
            @ParamInfo(order = 2, name = "第二引数") int y) {
        return x + y;
    }
    
    @ConsoleMenu(order = 2, title = "引き算")
    public int subtract(
            @ParamInfo(order = 1, name = "第一引数") int x,
            @ParamInfo(order = 2, name = "第二引数") int y) {
        return x - y;
    }

    @ConsoleMenu(order = 3, title = "何もしない")
    public int f() {
        throw new IllegalArgumentException("エラー!!!");
    }

    @ConsoleMenu(order = 4, title = "コンソール表示")
    public int g(boolean f, short i, double d, BigDecimal bd, BigDecimal bd2, Person2.GenderType gt) {
        System.out.println(bd);
        System.out.println(bd2);
        return 0;
    }
}
