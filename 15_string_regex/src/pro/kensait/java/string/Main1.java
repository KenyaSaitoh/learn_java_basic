package pro.kensait.java.string;

public class Main1 {
    public static void main(String[] args) {
        {
        String str = "foo";
        str = "bar"; // 新しいインスタンスが生成される（書き変わるわけではない）
        }
        {
        String str1 = "foo";
        String str2 = str1;
        str1 = "bar"; // str2は書き変わらない
        System.out.println(str2);
        }
        {
            String str1 = "foo";
            String str2 = "foo";
            boolean flag = str1 == str2;
            System.out.println(flag);
        }
        {
            String str1 = new String("foo");
            String str2 = new String("foo");
            boolean flag = str1 == str2;
            System.out.println(flag);
        }
    }
}
