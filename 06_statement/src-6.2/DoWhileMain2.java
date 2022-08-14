
public class DoWhileMain2 {
    public static void main(String[] args) {
        int i = 0; // ①
        do { // ②
            System.out.println("繰り返し, カウンタ変数 => " + i);
            i++; // ③
        } while(i < 10);
    }
}
