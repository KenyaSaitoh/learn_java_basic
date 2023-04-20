package pro.kensait.java.basic.lsn_20_2_4;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) throws Exception {
        {
            System.out.println("***** snippet_1 *****");
            LocalDate today = LocalDate.of(2022, 11, 5);
            LocalDate dueDate = LocalDate.of(2023, 3, 31);
            long remaining = ChronoUnit.DAYS.between(today, dueDate); //【1】
            System.out.println("残日数 => " + remaining);
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_2 *****");
            LocalTime start = LocalTime.of(9, 0); 
            LocalTime now = LocalTime.of(15, 20);
            long elapsed = ChronoUnit.MINUTES.between(start, now); //【1】
            System.out.println("経過時間（分） => " + elapsed);
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_3 *****");
            LocalDate start = LocalDate.of(2012, 4, 1);
            LocalDate today = LocalDate.of(2022, 11, 5);
            Period period = Period.between(start, today); //【1】
            System.out.println(period.getYears() + "年" +
                    period.getMonths() + "カ月" +
                    period.getDays() + "日"); //【2】
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_4 *****");
            LocalTime now = LocalTime.of(15, 20); 
            LocalTime timeLimit = LocalTime.of(21, 30); 
            Duration duration = Duration.between(now, timeLimit); //【1】
            System.out.println(duration.toHoursPart() + "時間" +
                    duration.toMinutesPart() + "分"); //【2】
            System.out.println("=> end");
        }
    }
}