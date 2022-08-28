package pro.kensait.java.text;

import java.text.MessageFormat;
import java.text.ParseException;

public class MessageFormatMain2 {

    public static void main(String[] args) {
        try {
            MessageFormat form = new MessageFormat("{0}さんは{1}さんの先輩です。");
            String message = "FooさんはBazさんの先輩です。";
            Object[] params = form.parse(message);
            for (int i = 0; i < params.length; i++) {
                System.out.println(i + "番目の要素 ---> " + params[i].toString());
            }
        } catch (ParseException pe) {
            pe.printStackTrace();
        }
    }
}