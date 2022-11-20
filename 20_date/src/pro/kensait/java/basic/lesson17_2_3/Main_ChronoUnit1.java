package pro.kensait.java.basic.lesson17_2_3;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Main_ChronoUnit1 {
    public static void main(String[] args) throws Exception {
        LocalDate today = LocalDate.of(2022, 11, 5);
        LocalDate dueDate = LocalDate.of(2023, 3, 31);
        long remaining = ChronoUnit.DAYS.between(today, dueDate);
        System.out.println("残日数 => " + remaining);
    }
}