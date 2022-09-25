package pro.kensait.java.basic.lesson19_1_5.catches;

public class Main1 {
    public static void main(String[] args) {
        try {
        } catch(Exception ex) {
            System.out.println("例外発生, msg => " + ex.getMessage());
        }
    }
}