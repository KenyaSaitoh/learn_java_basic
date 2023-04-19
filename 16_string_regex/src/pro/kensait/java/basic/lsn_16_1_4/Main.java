package pro.kensait.java.basic.lsn_16_1_4;

public class Main {
    public static void main(String[] args) {
        {
            System.out.println("***** snippet_1 *****");
            String str = "";
            for (int i = 0; i < 100000; i++) {
                str = str + "A";
            }
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_2 *****");
            StringBuilder sb = new StringBuilder("");
            for (int i = 0; i < 100000; i++) {
                sb.append("A");
            }
            String str = sb.toString();
            System.out.println("=> end");
        }
    }
}