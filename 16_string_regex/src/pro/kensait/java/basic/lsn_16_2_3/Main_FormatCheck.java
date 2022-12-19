package pro.kensait.java.basic.lsn_16_2_3;

import java.util.regex.Pattern;

public class Main_FormatCheck {
    public static void main(String[] args) {
        boolean flag1 = checkPhoneNumber("03-1234-5678");
        boolean flag2 = checkPhoneNumber("080-1234-5678");
        boolean flag3 = checkPhoneNumber("0467-12-3456");
        boolean flag4 = checkPhoneNumber("070-123-45678");
        System.out.println(flag1);
        System.out.println(flag2);
        System.out.println(flag3);
        System.out.println(flag4);
    }
    
    private static boolean checkPhoneNumber(String phoneNumber) {
        return Pattern.matches("\\d{2,4}-\\d{2,4}-\\d{4}", phoneNumber);
    }
}