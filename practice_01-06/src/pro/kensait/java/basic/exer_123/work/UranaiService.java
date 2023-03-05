package pro.kensait.java.basic.exer_123.work;

import java.time.LocalDate;

import pro.kensait.java.cuifw.ConsoleMenu;
import pro.kensait.java.cuifw.ParamInfo;

public class UranaiService {

    @ConsoleMenu(order = 1, title = "占う")
    public Unsei calcAvg(
            @ParamInfo(order = 1, name = "生年月日") LocalDate birthDay,
            @ParamInfo(order = 2, name = "今日") LocalDate today,
            @ParamInfo(order = 3, name = "名前") String name) {
        return Unsei.GOOD;
    }
    
    public static enum Unsei {
        GOOD, BAD;
    }
}
