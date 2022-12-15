package pro.kensait.java.basic.lsn_17_2_4;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main_ZonedDateTime1 {
    public static void main(String[] args) throws Exception {
        ZonedDateTime tkyDateTime = ZonedDateTime.of(2022, 11, 5, 15, 20, 0, 0,
                ZoneId.of("Asia/Tokyo"));
        System.out.println(tkyDateTime);
    }
}
