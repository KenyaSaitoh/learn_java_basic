package pro.kensait.java.basic.lsn_16_1_2;

public class Main7_Join {
    public static void main(String[] args) {
        {
            String str = "foo,bar,baz";
            String[] strArray = str.split(",");
            for (String s : strArray) {
                System.out.println(s);
            }
        }
        {
            String[] strArray = {"foo", "bar", "baz"};
            String str = String.join("#", strArray);
            System.out.println(str);
        }
    }
}