package pro.kensait.java.basic.lesson17_2_3;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Main_TemporalAdjuster {
    public static void main(String[] args) throws Exception {
        LocalDate orgDate = LocalDate.of(2022, 11, 5);
        LocalDate date1 = orgDate.with(TemporalAdjusters.firstDayOfMonth());
        LocalDate date2 = orgDate.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
        LocalDate date3 = orgDate.with(TemporalAdjusters.lastDayOfMonth());
        LocalDate date4 = orgDate.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
        LocalDate date5 = orgDate.with(TemporalAdjusters.previous(DayOfWeek.SUNDAY));
        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date3);
        System.out.println(date4);
        System.out.println(date5);
    }
}