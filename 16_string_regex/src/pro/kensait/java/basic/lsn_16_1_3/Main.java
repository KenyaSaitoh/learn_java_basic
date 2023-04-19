package pro.kensait.java.basic.lsn_16_1_3;

public class Main {
    public static void main(String[] args) {
        {
            System.out.println("***** snippet_1 *****");
            String str = String.format("私は%s、%d歳です。", "Alice", 25);
            System.out.println(str);
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_2 *****");
            String str = String.format("彼女は%1$sです。%1$sは%2$d歳です。", "Alice", 25);
            System.out.println(str);
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_3 *****");
            String str = String.format("私は%-7s、%05d歳です。", "Alice", 25);
            System.out.println(str);
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_4 *****");
            String str = String.format("私の身長は、%.2fcmです。", 165.5);
            System.out.println(str);
            System.out.println("=> end");
        }
    }
}