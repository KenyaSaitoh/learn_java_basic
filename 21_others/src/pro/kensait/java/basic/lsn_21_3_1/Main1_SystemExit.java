package pro.kensait.java.basic.lsn_21_3_1;

public class Main1_SystemExit {
    public static void main(String[] args) {
        String computer = System.getenv("COMPUTERNAME");
        System.out.println(computer);
        System.exit(0);
    }
}