package pro.kensait.java.basic.lsn_17_2_2;

import java.time.LocalDateTime;
import java.time.Month;

public class Main_LocalDateTime1 {
    public static void main(String[] args) throws Exception {
        LocalDateTime date = LocalDateTime.of(2022, 4, 10, 15, 20);
        LocalDateTime date2 = LocalDateTime.of(2022, Month.APRIL, 10, 15, 20);
        System.out.println(date);
        System.out.println(date.getSecond());
    }
}