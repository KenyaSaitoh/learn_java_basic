package pro.kensait.java.basic.lsn_20_2_1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZonedDateTime;

public class Main {
    public static void main(String[] args) {
        LocalDateTime now1 = LocalDateTime.now();
        LocalDate now2 = LocalDate.now();
        LocalTime now3 = LocalTime.now();
        OffsetDateTime now4 = OffsetDateTime.now();
        OffsetTime now5 = OffsetTime.now();
        ZonedDateTime now6 = ZonedDateTime.now();

        System.out.println("LocalDateTime => " + now1);
        System.out.println("LocalDate => " + now2);
        System.out.println("LocalTime => " + now3);
        System.out.println("OffsetDateTime => " + now4);
        System.out.println("OffsetTime => " + now5);
        System.out.println("ZonedDateTime => " + now6);
    }
}
