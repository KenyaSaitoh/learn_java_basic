public class Main1 {
    public static void main(String[] args) {
        {
            int x = 10;
            double y = x * 0.03;
        }
        {
            int x = 100;
            double y = x * 0.1;
        }
        {
            byte x = 100;
            x += 300;
            System.out.println(x);
        }
        {
            int x = 100;
            int y = (int) (x * 0.1);
        }
    }
}