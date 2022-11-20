package pro.kensait.java.basic.lesson17_2_3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main_Convert2 {
    public static void main(String[] args) throws Exception {
        LocalDate date = LocalDate.of(2022, 4, 10);
        LocalTime time = LocalTime.of(15, 20);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        System.out.println(dateTime);
    }
}