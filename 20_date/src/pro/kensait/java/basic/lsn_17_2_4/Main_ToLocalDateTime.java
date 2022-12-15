package pro.kensait.java.basic.lsn_17_2_4;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class Main_ToLocalDateTime {
    public static void main(String[] args) throws Exception {
        Date date = new Date();
        Instant instant = date.toInstant();
        LocalDateTime ldt = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
        System.out.println(ldt);
    }
}
