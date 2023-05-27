package pro.kensait.java.basic.lsn_17_2_1;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main_2 {
    public static void main(String[] args) {
        {
            System.out.println("***** snippet_1 *****");
            BigDecimal val1 = BigDecimal.valueOf(123.4567);
            BigDecimal val2 = BigDecimal.valueOf(90000.000009);
            BigDecimal result = val1.add(val2);
            System.out.println(result); // 90123.456709
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_2 *****");
            BigDecimal val1 = BigDecimal.valueOf(123.4567);
            BigDecimal val2 = val1.setScale(3, RoundingMode.HALF_UP); // 123.457
            System.out.println(val2);
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_3 *****");
            BigDecimal val1 = BigDecimal.valueOf(123.4567);
            BigDecimal val2 = BigDecimal.valueOf(3.0);
            BigDecimal result = val1.divide(val2, 5, RoundingMode.HALF_UP); // 41.15223
            System.out.println(result);
            System.out.println("=> end");
        }
    }
}