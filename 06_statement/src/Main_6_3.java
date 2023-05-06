import java.util.StringTokenizer;

public class Main_6_3 {
    @SuppressWarnings("unused")
    public static void main(String[] args) throws Exception {
        {
            System.out.println("***** snippet_1 *****");
            for (int i = 0; i < 10; i++) {
                System.out.println("繰り返し, カウンタ変数 => " + i);
            }
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_2 *****");
            int sum = 0; //【1】
            for (int i = 0; i < 10; i++) {
                sum += i + 1; //【2】
            }
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_3 *****");
            int sum = 0;
            for (int i = 1; i <= 10; i++) {
                sum += i;
            }
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_4 *****");
            int i = 0; //【1】
            while (i < 10) { //【2】
                System.out.println("繰り返し, カウンタ変数 => " + i);
                i++; //【3】
            }
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_5 *****");
            int total = 1; //【1】
            while (total < 10000) { //【2】
                total = total * 5; //【3】
            }
            System.out.println(total); //【4】
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_6 *****");
            String str = "foo,bar,baz,qux";
            StringTokenizer st = new StringTokenizer(str, ",");
            while (st.hasMoreTokens()) { // 【1】
                String name = st.nextToken();
                System.out.println(name);
            }
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_7 *****");
            int total = 1;
            do {
                total = total * 5;
            } while (total < 10000);
            System.out.println(total);
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_8 *****");
            int sum = 0;
            for (int i = 0; i < 100; i++) {
                int num = i + 1; // 加算する数
                if (num % 3 != 0) { //【1】
                    continue; //【2】
                }
                sum += i + 1; //【3】
            }
            System.out.println(sum);
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_9 *****");
            int sum = 0;
            for (int i = 0; i < 100; i++) {
                int num = i + 1;
                if (num % 3 == 0) {
                    sum += i + 1; // 3の倍数のときに加算
                }
            }
            System.out.println(sum);
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_10 *****");
            int[] nums = {8, 5, 10, 12, 1, 9}; //【1】
            boolean flag = false;//【2】
            for (int i = 0; i < 10; i++) {
                if (nums[i] % 3 == 0) { //【3】
                    flag = true; //【4】
                    break; //【5】
                }
            }
            System.out.println("=> end");
        }
    }
}