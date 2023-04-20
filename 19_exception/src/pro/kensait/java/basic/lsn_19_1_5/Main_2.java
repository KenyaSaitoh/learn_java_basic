package pro.kensait.java.basic.lsn_19_1_5;

public class Main_2 {
    public static void main(String[] args) {
        try {
        } catch (IllegalArgumentException iae) { //【1】
            System.out.println("引数不正, msg => " + iae.getMessage());
        } catch (RuntimeException re) { //【2】
            System.out.println("非チェック例外発生, msg => " + re.getMessage());
        } catch (Exception ex) { //【3】
            System.out.println("例外発生, msg => " + ex.getMessage());
        }
    }
}