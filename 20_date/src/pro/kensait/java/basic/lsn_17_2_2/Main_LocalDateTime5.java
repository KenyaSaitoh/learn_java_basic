package pro.kensait.java.basic.lsn_17_2_2;

import java.time.LocalDateTime;

public class Main_LocalDateTime5 {
    public static void main(String[] args) throws Exception {
        LocalDateTime now = LocalDateTime.now(); // 現在＝2022年11月5日
        LocalDateTime target = LocalDateTime.of(2022, 4, 10, 0, 0); // 2022年4月10日
        boolean result = now.isAfter(target);
        System.out.println(result);
    }
}