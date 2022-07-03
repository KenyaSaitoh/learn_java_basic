package pro.kensait.java.statement;

public class DoubleLoopMain {

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        int i = 0;
        LOOP1: while (true) {
            int j = 0;
            LOOP2: while (true) {
                System.out.println("[ " + i + ", " + j + " ]");
                if (i == 2 && j == 3)
                    break LOOP1;
                if (j == 3)
                    break;
                j = j + 1;
            }
            i = i + 1;
        }
    }
}