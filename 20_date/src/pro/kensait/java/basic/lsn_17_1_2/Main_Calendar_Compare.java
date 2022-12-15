package pro.kensait.java.basic.lsn_17_1_2;

import java.util.Calendar;

public class Main_Calendar_Compare {
    public static void main(String[] args) throws Exception {
        {
            // 現在日時を表すCalendarインスタンスを取得する
            Calendar current = Calendar.getInstance();
            // Calendarインスタンスを取得し「2022年4月10日」に設定する
            Calendar target = Calendar.getInstance();
            target.set(2022, 3, 10);
            int result = current.compareTo(target);
            System.out.println(result);

        }
        {
            // Calendarインスタンスを取得し「2022年4月10日」に設定する
            Calendar time1 = Calendar.getInstance();
            time1.set(2022, 3, 10);
            Thread.sleep(20000);
            // Calendarインスタンスを取得し「2022年4月10日」に設定する
            Calendar time2 = Calendar.getInstance();
            time2.set(2022, 3, 10);
            int result = time1.compareTo(time2);
            System.out.println(result);
        }
    }
}
