package pro.kensait.java.basic.lsn_21_2_1;

public class Main {
    public static void main(String[] args) {
        {
            boolean flag = nullCheck1(null, null);
            System.out.println(flag);
        }
        {
            boolean flag = nullCheck2(null, null);
            System.out.println(flag);
        }
    }

    private static boolean nullCheck1(String str1, String str2) {
        System.out.println("***** snippet_1 *****");
        if (str1 == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str1.equals(str2)) {
            return false;
        }
        return true;
    }

    private static boolean nullCheck2(String str1, String str2) {
        System.out.println("***** snippet_2 *****");
        if (str1 == null && str2 != null) {
            return false;
        } else if (!str1.equals(str2)) {
            return false;
        }
        return true;
    }
}