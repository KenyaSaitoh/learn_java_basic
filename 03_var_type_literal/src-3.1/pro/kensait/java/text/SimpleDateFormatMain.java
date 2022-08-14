package pro.kensait.java.text;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SimpleDateFormatMain {

    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar now = Calendar.getInstance();
        String str = sdf.format(now.getTime());
        System.out.println(str);
    }
}