package pro.kensait.java.basic.lsn_17_1_2;

public class Main {
    public static void main(String[] args) {
        {
            System.out.println("***** snippet_1 *****");
            String str = "100"; // 文字列"100"
            int value = Integer.parseInt(str); // 数値100
            System.out.println(value);
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_2 *****");
            Integer value1 = 10;
            Integer value2 = 10;
            boolean flag = value1.equals(value2);
            System.out.println(flag);
            System.out.println("=> end");
        }
    }
}