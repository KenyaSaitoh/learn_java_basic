package pro.kensait.java.basic.lesson17_1_2;

import java.util.Date;

public class Main_Date {
    public static void main(String[] args) throws Exception {
        Date now = new Date();
        System.out.println("現在時刻 => " + now.getTime());

        Date dateEpoch = new Date(0);
        System.out.println("基準時刻 => " + dateEpoch);
        
        long currentTime = System.currentTimeMillis();
        Date now2 = new Date(currentTime);
        System.out.println("現在時刻 => " + now2);
        Thread.sleep(3000);
        now.setTime(currentTime);
        System.out.println("現在時刻 => " + now.getTime());
    }
}
