package pro.kensait.java.basic.lesson19_1_5.catches;

public class Main5 {
    public static void main(String[] args) {
        try {
            Hoge hoge = new Hoge();
            hoge.process();
        } catch (FooException be) {
            System.out.println("例外発生, msg => " + be.getMessage());
        }
    }
}