package pro.kensait.java.basic.lsn_11_1_4;

public class Main_2 {
    public static void main(String[] args) {
        Foo foo = new Qux();
        Bar bar = (Bar) foo;
        Qux qux = (Qux) foo;
        // Hoge hoge = (Hoge) foo; // 実行時例外
        // Baz baz = (Baz) foo; // 実行時例外
    }
}