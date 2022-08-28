package pro.kensait.java.util;

import java.util.Calendar;

public class CalendarMain2 {

    public static void main(String[] args) {
        // システム時刻を表すCalendarオブジェクト
        Calendar cal = Calendar.getInstance();
        // 2004年8月24日を設定
        cal.set(2004, 7, 24, 0, 0);
        print(cal);
        // 日を3日進める
        cal.add(Calendar.DATE, 3);
        print(cal);
        // 月を1カ月戻す
        cal.add(Calendar.MONTH, -1);
        print(cal);
        // 日を10日進める
        cal.add(Calendar.DATE, 10);
        print(cal);
    }

    private static void print(Calendar cal) {
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH) + 1;
        int day = cal.get(Calendar.DATE);
        System.out.println(year + "年" + month + "月" + day + "日");
    }
}