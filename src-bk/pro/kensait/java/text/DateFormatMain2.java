package pro.kensait.java.text;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class DateFormatMain2 {

    public static void main(String[] args) {
        DateFormat df = DateFormat.getDateInstance();
        try {
            Date mydate = df.parse("2001/03/24");
            System.out.println(mydate.toString());
        } catch (ParseException pe) {
            pe.printStackTrace();
        }
    }
}