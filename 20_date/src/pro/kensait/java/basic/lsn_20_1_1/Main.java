package pro.kensait.java.basic.lsn_20_1_1;

import java.util.Date;

public class Main {
    public static void main(String[] args) throws Exception {
        {
            System.out.println("***** snippet_1 *****");
            Date now = new Date();
            System.out.println("現在時刻 => " + now);
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_2 *****");
            long currentTime = System.currentTimeMillis();
            Date now2 = new Date(currentTime);
            System.out.println("現在時刻 => " + now2);
            System.out.println("=> end");
        }
    }
}
