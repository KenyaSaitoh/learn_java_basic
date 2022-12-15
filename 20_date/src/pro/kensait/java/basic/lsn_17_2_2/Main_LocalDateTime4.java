package pro.kensait.java.basic.lsn_17_2_2;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class Main_LocalDateTime4 {
    public static void main(String[] args) throws Exception {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime date = now.minusYears(5).plusMonths(1).withDayOfMonth(10);
        if (date.getDayOfWeek() == DayOfWeek.SUNDAY) {
            System.out.println("The day is SUNDAY");
        }
    }
}
