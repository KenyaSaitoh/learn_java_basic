package pro.kensait.java.basic.lsn_17_2_5;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main_Formatter1 {
    public static void main(String[] args) throws Exception {
        LocalDateTime date = LocalDateTime.of(2022, 4, 5, 8, 5, 3, 123456789);

        String dateStr1 = date.format(DateTimeFormatter.ofPattern("y年M月d日 H時m分s秒"));
        System.out.println(dateStr1);
        
        String dateStr2 = date.format(DateTimeFormatter.ofPattern("y/MM/dd HH:mm:ss:n"));
        System.out.println(dateStr2);
    }
}