package pro.kensait.java.basic.lsn_21_3_1;

public class Main {
    public static void main(String[] args) {
        {
            System.out.println("***** snippet_1 *****");
            String computer = System.getenv("COMPUTERNAME");
            System.out.println(computer);
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_2 *****");
            String userHome = System.getProperty("user.home");
            System.out.println(userHome);
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_3 *****");
            String separator = System.getProperty("line.separator");
            String message = "こんにちは！" + separator + "私はAlice、25歳です。";
            System.out.println(message);
            System.out.println("=> end");
        }
    }
}