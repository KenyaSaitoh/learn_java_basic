package pro.kensait.java.basic.lsn_20_1_4;

import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws Exception {
        {
            System.out.println("***** snippet_1 *****");
            Calendar cal = Calendar.getInstance();
            cal.set(1997, 3, 10); //【1】1997年4月10日
            Date birthday = cal.getTime(); //【2】
            Person alice = new Person("Alice", 25, birthday); //【3】
            System.out.println(alice);
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_2 *****");
            Calendar cal = Calendar.getInstance();
            cal.set(1997, 3, 10); // 1997年4月10日
            Date birthday = cal.getTime();
            Person alice = new Person("Alice", 25, birthday);
            String birthdayStr = alice.getBirthDayStr();
            System.out.println(birthdayStr);
            System.out.println("=> end");
        }
    }
}