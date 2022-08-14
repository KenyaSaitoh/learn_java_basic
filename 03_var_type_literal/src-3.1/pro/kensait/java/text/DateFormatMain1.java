package pro.kensait.java.text;

import java.text.DateFormat;
import java.util.Date;

public class DateFormatMain1 {

    public static void main(String[] args) {
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.DEFAULT);
        DateFormat df2 = DateFormat.getTimeInstance(DateFormat.FULL);
        DateFormat df3 = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.MEDIUM);
        DateFormat df4 = DateFormat.getInstance();
        System.out.println(df1.format(new Date()));
        System.out.println(df2.format(new Date()));
        System.out.println(df3.format(new Date()));
        System.out.println(df4.format(new Date()));
    }
}