package pro.kensait.java.basic.lesson17_2_3;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Main_ChronoUnit2 {
    public static void main(String[] args) throws Exception {
        LocalTime start = LocalTime.of(9, 0); 
        LocalTime now = LocalTime.of(15, 20);
        long elapsed = ChronoUnit.MINUTES.between(start, now);
        System.out.println("経過時間（分） => " + elapsed);
    }
}