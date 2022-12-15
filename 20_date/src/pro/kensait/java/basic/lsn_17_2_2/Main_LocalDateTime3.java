package pro.kensait.java.basic.lsn_17_2_2;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class Main_LocalDateTime3 {
    public static void main(String[] args) throws Exception {
        LocalDateTime now = LocalDateTime.now();
        int month = now.getMonthValue();
        int day = now.getDayOfMonth();
        DayOfWeek dayOfWeek = now.getDayOfWeek();
        System.out.println(month + "," + day + "," + dayOfWeek);
    }
}
