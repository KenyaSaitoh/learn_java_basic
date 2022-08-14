package pro.kensait.java.util;

import java.util.Calendar;

public class CalendarMain1 {

    public static void main(String[] args) {
        int year, month, date, hour, minute, second, dayofweek;
        String days[] = { "日曜日", "月曜日", "火曜日", "水曜日", "木曜日", "金曜日", "土曜日" };
        Calendar now = Calendar.getInstance();
        // 日付の出力
        System.out.println(now.getTime());
        year = now.get(Calendar.YEAR);
        month = now.get(Calendar.MONTH) + 1;
        date = now.get(Calendar.DATE);
        hour = now.get(Calendar.HOUR);
        minute = now.get(Calendar.MINUTE);
        second = now.get(Calendar.SECOND);
        dayofweek = now.get(Calendar.DAY_OF_WEEK) - 1;
        // 書式を付けて日付を出力
        System.out.println(year + "年" + month + "月" + date + "日 " + hour + "時" + minute + "分" + second + "秒 "
                + days[dayofweek]);
    }
}