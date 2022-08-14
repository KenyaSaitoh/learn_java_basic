public class Printer {
    void printMessage(String message, int count) {
        System.out.println("#####");
        for (int i = 0; i < count; i++) {
            System.out.println(message);
        }
        System.out.println("#####");
    }
}