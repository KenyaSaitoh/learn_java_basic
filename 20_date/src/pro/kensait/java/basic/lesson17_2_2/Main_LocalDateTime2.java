package pro.kensait.java.basic.lesson17_2_2;

import java.time.LocalDateTime;

public class Main_LocalDateTime2 {
    public static void main(String[] args) throws Exception {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime date = now.withHour(15).withMinute(20);
        System.out.println(date);
    }
}
