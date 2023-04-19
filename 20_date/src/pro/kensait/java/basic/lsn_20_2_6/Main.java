package pro.kensait.java.basic.lsn_20_2_6;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) throws Exception {
        {
            System.out.println("***** snippet_1 *****");
            LocalDateTime date = LocalDateTime.of(2022, 4, 5, 8, 5, 3, 123456789);
            String dateStr1 = date.format(DateTimeFormatter.ofPattern("y年M月d日 H時m分s秒"));
            System.out.println(dateStr1);
            String dateStr2 = date
                    .format(DateTimeFormatter.ofPattern("y/MM/dd HH:mm:ss:n"));
            System.out.println(dateStr2);
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_2 *****");
            LocalDateTime date = LocalDateTime.parse("2022-04-05T08:05:03");
            System.out.println(date);
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_3 *****");
            LocalDateTime date = LocalDateTime.parse("2022年4月5日 8時5分3秒",
                    DateTimeFormatter.ofPattern("y年M月d日 H時m分s秒"));
            System.out.println(date);
            System.out.println("=> end");
        }
    }
}