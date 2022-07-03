package pro.kensait.java.util;

import java.util.Date;

public class DateMain2 {

    public static void main(String[] args) {
        int length = 3;
        long[] times = new long[3];
        for (int i = 0; i < length; i++) {
            times[i] = System.currentTimeMillis();
            printTime(times[i]);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static void printTime(long time) {
        Date date = new Date(time);
        System.out.println("現在時刻 ---> " + date + " [" + time + "]");
    }
}