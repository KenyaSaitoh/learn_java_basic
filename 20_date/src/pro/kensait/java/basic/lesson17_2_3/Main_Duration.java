package pro.kensait.java.basic.lesson17_2_3;

import java.time.Duration;
import java.time.LocalTime;

public class Main_Duration {
    public static void main(String[] args) throws Exception {
        LocalTime now = LocalTime.of(15, 20); 
        LocalTime timeLimit = LocalTime.of(21, 30); 
        Duration duration = Duration.between(now, timeLimit);
        System.out.println(duration.toHoursPart() + "時間" +
                duration.toMinutesPart() + "分");
    }
}