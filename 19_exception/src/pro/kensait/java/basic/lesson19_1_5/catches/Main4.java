package pro.kensait.java.basic.lesson19_1_5.catches;

public class Main4 {
    public static void main(String[] args) {
        try {
            if (args[0].equals("")) {
                throw new BarException();
            }
            throw new BazException();
        } catch (BarException | BazException ex) {
            System.out.println("例外発生, msg => " + ex.getMessage());
        }
    }
}