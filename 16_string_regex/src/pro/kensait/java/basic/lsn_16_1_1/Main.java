package pro.kensait.java.basic.lsn_16_1_1;

public class Main {
    public static void main(String[] args) {
        {
            System.out.println("***** snippet_1 *****");
            String str = "foo";
            str = "bar"; // 新しいインスタンスが生成される（書き変わるわけではない）
        }
        {
            System.out.println("***** snippet_2 *****");
            String str1 = "foo";
            String str2 = str1;
            str2 = "bar"; // str1は書き変わらない
            System.out.println(str1);
        }
        {
            System.out.println("***** snippet_3 *****");
            String str1 = "foo";
            String str2 = "foo";
            boolean flag = str1 == str2;
            System.out.println(flag);
        }
        {
            System.out.println("***** snippet_4 *****");
            String str1 = new String("foo");
            String str2 = new String("foo");
            boolean flag = str1 == str2;
            System.out.println(flag);
        }
    }
}