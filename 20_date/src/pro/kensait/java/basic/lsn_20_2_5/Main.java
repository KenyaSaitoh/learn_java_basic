package pro.kensait.java.basic.lsn_20_2_5;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws Exception {
        {
            System.out.println("***** snippet_1 *****");
            ZonedDateTime dateTime = ZonedDateTime.of(2022, 11, 5, 15, 20, 0, 0,
                    ZoneId.systemDefault());
            System.out.println(dateTime);
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_2 *****");
            ZonedDateTime tkyDateTime = ZonedDateTime.of(2022, 11, 5, 15, 20, 0, 0,
                    ZoneId.of("Asia/Tokyo"));
            System.out.println(tkyDateTime);
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_3 *****");
            LocalDateTime dateTime = LocalDateTime.of(2022, 11, 5, 15, 20, 0, 0);
            ZonedDateTime tkyDateTime = ZonedDateTime.of(dateTime,
                    ZoneId.of("Asia/Tokyo")); //【1】
            ZonedDateTime nycDateTime = ZonedDateTime.of(dateTime,
                    ZoneId.of("America/New_York")); //【2】
            System.out.println(nycDateTime);
            long diff = ChronoUnit.HOURS.between(tkyDateTime, nycDateTime); //【3】
            System.out.println(diff);
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_4 *****");
            LocalDateTime ldt = LocalDateTime.of(2022, 4, 10, 15, 20);
            ZonedDateTime zdt = ZonedDateTime.of(ldt, ZoneId.systemDefault());
            Instant instant = zdt.toInstant();
            Date date = Date.from(instant);
            System.out.println(date);
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_5 *****");
            Date date = new Date();
            Instant instant = date.toInstant();
            LocalDateTime ldt = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
            System.out.println(ldt);
            System.out.println("=> end");
        }
    }
}
