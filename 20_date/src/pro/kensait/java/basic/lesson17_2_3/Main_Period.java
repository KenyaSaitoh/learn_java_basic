package pro.kensait.java.basic.lesson17_2_3;

import java.time.LocalDate;
import java.time.Period;

public class Main_Period {
    public static void main(String[] args) throws Exception {
        LocalDate start = LocalDate.of(2012, 4, 1);
        LocalDate today = LocalDate.of(2022, 11, 5);
        Period period = Period.between(start, today);
        System.out.println(period.getYears() + "年" +
                period.getMonths() + "カ月" +
                period.getDays() + "日");
    }
}