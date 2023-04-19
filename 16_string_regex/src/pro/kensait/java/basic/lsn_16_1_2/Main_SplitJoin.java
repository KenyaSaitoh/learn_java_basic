package pro.kensait.java.basic.lsn_16_1_2;

public class Main_SplitJoin {
    public static void main(String[] args) {
        {
            System.out.println("***** snippet_1 *****");
            String str = "foo,bar,baz";
            String[] strArray = str.split(",");
            for (String s : strArray) {
                System.out.println(s);
            }
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_2 *****");
            String[] strArray = {"foo", "bar", "baz"};
            String str = String.join("#", strArray);
            System.out.println(str);
            System.out.println("=> end");
        }
    }
}