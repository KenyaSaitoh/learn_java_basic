package pro.kensait.java.basic.lsn_20_1_2;

import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws Exception {
        {
            System.out.println("***** snippet_1 *****");
            Calendar cal = Calendar.getInstance();
            System.out.println("現在日時 => " + cal);
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_2 *****");
            Calendar cal = Calendar.getInstance();
            cal.set(2022, 10, 5, 15, 20);
            System.out.println("現在日時 => " + cal.getTime());
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_3 *****");
            Calendar cal = Calendar.getInstance();
            int year = cal.get(Calendar.YEAR);
            int month = cal.get(Calendar.MONTH) + 1;
            int day = cal.get(Calendar.DAY_OF_MONTH);
            System.out.println(year + "-" + month + "-" + day);
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_4 *****");
            Calendar cal = Calendar.getInstance();
            cal.set(2022, 10, 5, 15, 20);
            cal.add(Calendar.DAY_OF_MONTH, -10);
            System.out.println("10日前 => " + cal.getTime());
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_5 *****");
            Calendar cal = Calendar.getInstance();
            cal.set(2022, 10, 5, 15, 20);
            cal.add(Calendar.MONTH, -1);
            cal.set(Calendar.DATE, 1);
            System.out.println("前月の月初日 => " + cal.getTime());
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_6 *****");
            Calendar current = Calendar.getInstance();
            Calendar target = Calendar.getInstance();
            target.set(2022, 3, 10);
            int result = current.compareTo(target);
            System.out.println(result);
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_7 *****");
            Calendar time1 = Calendar.getInstance();
            time1.set(2022, 3, 10);
            Thread.sleep(20000);
            Calendar time2 = Calendar.getInstance();
            time2.set(2022, 3, 10);
            int result = time1.compareTo(time2);
            System.out.println(result);
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_8 *****");
            Calendar cal = Calendar.getInstance();
            Date now = cal.getTime();
            System.out.println(now);
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_9 *****");
            Date now = new Date();
            Calendar cal = Calendar.getInstance();
            cal.setTime(now);
            System.out.println(cal);
            System.out.println("=> end");
        }
    }
}
