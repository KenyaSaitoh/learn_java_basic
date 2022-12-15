package pro.kensait.java.basic.lsn_17_2_5;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main_Formatter2 {
    public static void main(String[] args) throws Exception {
        LocalDateTime date1 = LocalDateTime.parse("2022-04-05T08:05:03");
        System.out.println(date1);
        
        LocalDateTime date2 = LocalDateTime.parse("2022年4月5日 8時5分3秒",
                DateTimeFormatter.ofPattern("y年M月d日 H時m分s秒"));
        System.out.println(date2);
    }
}