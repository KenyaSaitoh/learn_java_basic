package pro.kensait.java.basic.lesson17_1_2;

import java.util.Calendar;
import java.util.Date;

public class Main_Person {
    public static void main(String[] args) throws Exception {
        Calendar cal = Calendar.getInstance();
        cal.set(1997, 3, 10); // 1997年4月10日
        Date birthday = cal.getTime();
        Person alice = new Person("Alice", 25, birthday);
        String birthdayStr = alice.getBirthDayStr();
        System.out.println(birthdayStr);
    }
}