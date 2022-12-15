package pro.kensait.java.basic.lsn_19_1_5.catches;

public class Main2 {
    public static void main(String[] args) {
        try {

        } catch (IllegalArgumentException iae) {
            System.out.println("引数不正, msg => " + iae.getMessage());
        } catch (RuntimeException re) {
            System.out.println("非チェック例外発生, msg => " + re.getMessage());
        } catch (Exception ex) {
            System.out.println("例外発生, msg => " + ex.getMessage());
        }
    }
}