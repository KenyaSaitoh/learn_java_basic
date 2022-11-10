public class Main_MethodNested {
    public static void main(String[] args) {
        System.out.println(getGreeting(getUpperCase("Alice")));
    }

    private static String getUpperCase(String name) {
        return name.toUpperCase();
    }

    private static String getGreeting(String name) {
        return "Hello, " + name;
    }
}
