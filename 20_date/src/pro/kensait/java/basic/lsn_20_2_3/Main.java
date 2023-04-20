package pro.kensait.java.basic.lsn_20_2_3;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.TemporalAdjusters;

public class Main {
    public static void main(String[] args) throws Exception {
        {
            System.out.println("***** snippet_1 *****");
            LocalDate date = LocalDate.of(2022, 4, 10);
            System.out.println(date);
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_2 *****");
            LocalTime time = LocalTime.of(8, 40);
            System.out.println(time);
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_3 *****");
            LocalDateTime dateTime = LocalDateTime.of(2022, 4, 10, 15, 20);
            LocalDate date = dateTime.toLocalDate();
            LocalTime time = dateTime.toLocalTime();
            System.out.println(date);
            System.out.println(time);
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_4 *****");
            LocalDate date = LocalDate.of(2022, 4, 10);
            LocalTime time = LocalTime.of(15, 20);
            LocalDateTime dateTime = LocalDateTime.of(date, time);
            System.out.println(dateTime);
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_5 *****");
            LocalDate orgDate = LocalDate.of(2022, 11, 5);
            LocalDate date1 = orgDate.with(
                    TemporalAdjusters.firstDayOfMonth()); //【1】月の最初の日＝11月1日
            LocalDate date2 = orgDate.with(
                    TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY)); //【2】月の最初の月曜日＝11月7日
            LocalDate date3 = orgDate.with(
                    TemporalAdjusters.lastDayOfMonth()); //【3】月の最後の日（月末日）＝11月30日
            LocalDate date4 = orgDate.with(
                    TemporalAdjusters.next(DayOfWeek.FRIDAY)); //【4】直後の金曜日＝11月11日
            LocalDate date5 = orgDate.with(
                    TemporalAdjusters.previous(DayOfWeek.SUNDAY)); //【5】直前の日曜日＝10月30日
            System.out.println(date1);
            System.out.println(date2);
            System.out.println(date3);
            System.out.println(date4);
            System.out.println(date5);
            System.out.println("=> end");
        }
    }
}