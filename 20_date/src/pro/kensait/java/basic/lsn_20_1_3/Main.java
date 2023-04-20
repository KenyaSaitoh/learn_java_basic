package pro.kensait.java.basic.lsn_20_1_3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        {
            System.out.println("***** snippet_1 *****");
            SimpleDateFormat df = new SimpleDateFormat("yyyy/M/d H:m:s"); //【1】
            Date date = new Date();
            String dateStr = df.format(date); //【2】
            System.out.println(dateStr);
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_2 *****");
            SimpleDateFormat df = new SimpleDateFormat("yyyy/M/d H:m:s"); //【1】
            try {
                Date date = df.parse("2022/11/05 15:20:30"); //【2】
                System.out.println(date);
            } catch (ParseException pe) {
                new RuntimeException(pe);
            }
            System.out.println("=> end");
        }
    }
}
