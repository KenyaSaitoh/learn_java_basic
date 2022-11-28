package pro.kensait.java.basic.lesson17_1_2;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main1 {
    public static void main(String[] args) {
        {
            System.out.println("***** snippet 17_1_2_1 *****");
            double d1 = 0.1 + 0.2;
            double d2 = 0.3;
            System.out.println(d1 == d2);
        }
        {
            System.out.println("***** snippet 17_1_2_2 *****");
            BigDecimal val1 = new BigDecimal(123.4567);
            System.out.println(val1);
            System.out.println(val1.precision());
            System.out.println(val1.scale());
            BigDecimal val2 = new BigDecimal(0.2);
            BigDecimal val3 = new BigDecimal(0.3);
            System.out.println(val1.add(val2).equals(val3));
        }
        {
            System.out.println("***** snippet 17_1_2_3 *****");
            BigDecimal bd1 = BigDecimal.valueOf(0.1);
            BigDecimal bd2 = BigDecimal.valueOf(0.2);
            BigDecimal bd3 = BigDecimal.valueOf(0.3);
            System.out.println(bd1);
            System.out.println(bd1.add(bd2).equals(bd3));
        }
        {
            System.out.println("***** snippet 17_1_2_4 *****");
            BigDecimal val = new BigDecimal("123.4567");
            System.out.println(val);
            System.out.println(val.precision());
            System.out.println(val.scale());
        }
        {
            System.out.println("***** snippet 17_1_2_4 *****");
            BigDecimal val = BigDecimal.valueOf(1234567, 4);
            System.out.println(val);
            System.out.println(val.precision());
            System.out.println(val.scale());
        }
        {
            System.out.println("***** snippet 17_1_2_4 *****");
            BigDecimal val = BigDecimal.valueOf(123.4567);
            System.out.println(val);
            System.out.println(val.precision());
            System.out.println(val.scale());
        }
        {
            System.out.println("***** snippet 17_1_2_4 *****");
            BigDecimal bd1 = new BigDecimal(0.1).setScale(10, RoundingMode.HALF_DOWN);
            BigDecimal bd2 = new BigDecimal(0.2).setScale(1, RoundingMode.HALF_DOWN);
            BigDecimal bd3 = new BigDecimal(0.3).setScale(1, RoundingMode.HALF_DOWN);
            System.out.println(bd1.scale());
            System.out.println(bd1.precision());
            System.out.println(bd1.add(bd2).equals(bd3));
        }
    }
}