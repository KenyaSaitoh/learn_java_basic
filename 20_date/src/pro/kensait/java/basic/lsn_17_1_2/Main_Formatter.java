package pro.kensait.java.basic.lsn_17_1_2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main_Formatter {
    public static void main(String[] args) throws Exception {
        SimpleDateFormat df = new SimpleDateFormat("yyyy/M/d H:m:s");

        Date date1 = new Date();
        String dateStr = df.format(date1);
        System.out.println(dateStr);

        Date date2 = df.parse("2022/11/05 15:20:30");
        System.out.println(date2);
    }
}
