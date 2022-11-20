package pro.kensait.java.basic.lesson17_2_4;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class Main_ZonedDateTime2 {
    public static void main(String[] args) throws Exception {
        LocalDateTime dateTime = LocalDateTime.of(2022, 11, 5, 15, 20, 0, 0);
        ZonedDateTime tkyDateTime = ZonedDateTime.of(dateTime, ZoneId.of("Asia/Tokyo"));
        ZonedDateTime nycDateTime = ZonedDateTime.of(dateTime, ZoneId.of("America/New_York"));
        System.out.println(nycDateTime);
        long diff = ChronoUnit.HOURS.between(tkyDateTime, nycDateTime);
        System.out.println(diff);
    }
}
