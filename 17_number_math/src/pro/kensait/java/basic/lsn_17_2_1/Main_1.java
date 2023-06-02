package pro.kensait.java.basic.lsn_17_2_1;

import java.math.BigDecimal;

public class Main_1 {
    public static void main(String[] args) {
        {
            System.out.println("***** snippet_1 *****");
            BigDecimal val = new BigDecimal(10000);
            System.out.println(val);
            System.out.println(val.precision());
            System.out.println(val.scale());
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_2 *****");
            BigDecimal val = new BigDecimal("123.4567");
            System.out.println(val);
            System.out.println(val.precision());
            System.out.println(val.scale());
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_3 *****");
            BigDecimal val = BigDecimal.valueOf(1234567, 4);
            System.out.println(val);
            System.out.println(val.precision());
            System.out.println(val.scale());
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_4 *****");
            BigDecimal val = BigDecimal.valueOf(123.4567);
            System.out.println(val);
            System.out.println(val.precision());
            System.out.println(val.scale());
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_5 *****");
            BigDecimal val = new BigDecimal(123.4567);
            System.out.println(val);
            System.out.println(val.precision());
            System.out.println(val.scale());
            System.out.println("=> end");
        }
    }
}