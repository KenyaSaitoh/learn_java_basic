package pro.kensait.java.basic.lesson17_2_4;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class Main_ToDate {
    public static void main(String[] args) throws Exception {
        LocalDateTime ldt = LocalDateTime.of(2022, 4, 10, 15, 20);
        ZonedDateTime zdt = ZonedDateTime.of(ldt, ZoneId.systemDefault());
        Instant instant = zdt.toInstant();
        Date date = Date.from(instant);
        System.out.println(date);
    }
}
