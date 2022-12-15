package pro.kensait.java.basic.lsn_17_1_2;

import java.util.Calendar;
import java.util.Date;

public class Main_Calendar {
    public static void main(String[] args) {
        // 現在日時を表すCalendarインスタンスを取得する
        Calendar cal = Calendar.getInstance();
        Date now = cal.getTime();
        System.out.println("現在日時 => " + now);

        // このCalendarの日時を「2022年11月5日15時20分」に設定する
        cal.set(2022, 10, 5, 15, 20);

        // このCalendarの年を取得する
        int year = cal.get(Calendar.YEAR);
        System.out.println("年 => " + year);

        // 月の日を10日戻す
        cal.add(Calendar.DAY_OF_MONTH, -10);
        Date before10Day = cal.getTime();
        System.out.println("10日前 => " + before10Day);

        // 前月の月初日に設定する
        cal.add(Calendar.MONTH, -1);
        cal.set(Calendar.DATE, 1);
        Date prevMonth1stDay = cal.getTime();
        System.out.println("前月の月初日 => " + prevMonth1stDay);

        Calendar cal2 = Calendar.getInstance();
        cal2.setTime(now);
    }
}
