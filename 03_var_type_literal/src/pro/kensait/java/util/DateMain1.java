package pro.kensait.java.util;

import java.util.Date;

public class DateMain1 {

    public static void main(String[] args) {
        Date now = new Date();
        System.out.println("現在時刻 ---> " + now);
        Date dateEpoch = new Date(0);
        System.out.println("基準時刻 ---> " + dateEpoch);
    }
}