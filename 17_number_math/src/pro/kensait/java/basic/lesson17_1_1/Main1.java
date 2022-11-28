package pro.kensait.java.basic.lesson17_1_1;

public class Main1 {
    public static void main(String[] args) {
        {
            System.out.println("***** code snippet 16_1_1_1 *****");
            int x = 30;
            Integer value = x;
            int y = value + 10;
        }
        {
            String str = "100"; // 文字列"100"
            int value = Integer.parseInt(str); // 数値100
        }
        {
            System.out.println("***** code snippet 16_1_1_2 *****");
            Integer value1 = 10;
            Integer value2 = 10;
            boolean b = value1.equals(value2);
            System.out.println(b);
        }
        {
            double value = 10.0;
            double value2= value / 0;
            System.out.println(value2);
        }
        {
            int value = 10;
            int value2= value / 0;
            System.out.println(value2);
        }
    }
}