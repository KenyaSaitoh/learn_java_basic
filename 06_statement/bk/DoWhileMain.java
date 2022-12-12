
public class DoWhileMain {
    public static void main(String[] args) {
        int total = 1; // ①
        do { // ②
            total = total * 5;
        } while (total < 10000);
        System.out.println(total);
    }
}
