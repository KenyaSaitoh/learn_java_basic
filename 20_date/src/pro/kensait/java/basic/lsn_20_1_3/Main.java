package pro.kensait.java.basic.lsn_20_1_3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        {
            System.out.println("***** snippet_1 *****");
            SimpleDateFormat df = new SimpleDateFormat("yyyy/M/d H:m:s");
            Date date = new Date();
            String dateStr = df.format(date);
            System.out.println(dateStr);
        }
        {
            System.out.println("***** snippet_2 *****");
            SimpleDateFormat df = new SimpleDateFormat("yyyy/M/d H:m:s");
            try {
                Date date = df.parse("2022/11/05 15:20:30");
                System.out.println(date);
            } catch (ParseException pe) {
                new RuntimeException(pe);
            }
        }
    }
}
