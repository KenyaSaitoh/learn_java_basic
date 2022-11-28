package pro.kensait.java.basic.lesson17_1_2;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main2 {
    public static void main(String[] args) {
        {
            System.out.println("***** snippet 17_1_2_1 *****");
            BigDecimal val1 = BigDecimal.valueOf(123.4567);
            BigDecimal val2 = BigDecimal.valueOf(90000.000009);
            BigDecimal result = val1.add(val2);
            System.out.println(result);
        }
        {
            System.out.println("***** snippet 17_1_2_1 *****");
            BigDecimal val1 = BigDecimal.valueOf(123.4567);
            BigDecimal val2 = BigDecimal.valueOf(3.0);
            //BigDecimal result = val1.divide(val2);
            BigDecimal result = val1.divide(val2, 5, RoundingMode.HALF_UP);
            System.out.println(result);
        }
        {
            System.out.println("***** snippet 17_1_2_1 *****");
            BigDecimal val1 = BigDecimal.valueOf(123.4567);
            BigDecimal val2 = val1.setScale(3, RoundingMode.HALF_UP);
            System.out.println(val2);
        }
        {
            System.out.println("***** snippet 17_1_2_1 *****");
            BigDecimal val1 = BigDecimal.valueOf(123.45675);
            BigDecimal val2 = val1.setScale(4, RoundingMode.HALF_DOWN);
            System.out.println(val2);
        }
        {
            System.out.println("***** snippet 17_1_2_1 *****");
            BigDecimal val1 = BigDecimal.valueOf(123.45675);
            BigDecimal val2 = val1.setScale(4, RoundingMode.HALF_EVEN);
            System.out.println(val2);
        }
        {
            System.out.println("***** snippet 17_1_2_1 *****");
            BigDecimal val1 = BigDecimal.valueOf(123.456);
            BigDecimal val2 = val1.setScale(5);
            System.out.println(val2);
        }
    }
}