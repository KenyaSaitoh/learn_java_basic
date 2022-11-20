package pro.kensait.java.basic.lesson17_2_3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main_Convert1 {
    public static void main(String[] args) throws Exception {
        LocalDateTime dateTime = LocalDateTime.of(2022, 4, 10, 15, 20);
        LocalDate date = dateTime.toLocalDate();
        LocalTime time = dateTime.toLocalTime();
        System.out.println(date);
        System.out.println(time);
    }
}