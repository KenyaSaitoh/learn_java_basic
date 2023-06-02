package pro.kensait.java.basic.lsn_20_2_2;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        {
            System.out.println("***** snippet_1 *****");
            LocalDateTime date = LocalDateTime.of(2022, 4, 10, 15, 20);
            System.out.println(date);
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_2 *****");
            LocalDateTime date = LocalDateTime.of(2022, Month.APRIL, 10, 15, 20);
            System.out.println(date);
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_3 *****");
            LocalDateTime now = LocalDateTime.now();
            LocalDateTime date = now.withHour(15).withMinute(20);
            System.out.println(date);
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_4 *****");
            LocalDateTime now = LocalDateTime.now();
            int month = now.getMonthValue();
            int day = now.getDayOfMonth();
            DayOfWeek dayOfWeek = now.getDayOfWeek();
            System.out.println(month + "," + day + "," + dayOfWeek);
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_5 *****");
            LocalDateTime now = LocalDateTime.of(2022, 11, 5, 0, 0);
            LocalDateTime date = now.minusYears(5).plusMonths(1).withDayOfMonth(10);
            if (date.getDayOfWeek() == DayOfWeek.SUNDAY) {
                System.out.println("The day is SUNDAY");
            }
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_6 *****");
            LocalDateTime now = LocalDateTime.now(); // 現在
            LocalDateTime target = LocalDateTime.of(2022, 4, 10, 0, 0); // 2022年4月10日
            boolean result = now.isAfter(target);
            System.out.println(result);
            System.out.println("=> end");
        }
    }
}