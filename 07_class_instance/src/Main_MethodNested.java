public class Main_MethodNested {
    public static void main(String[] args) {
        System.out.println(getGreeting(getUpperCase("Alice")));
    }

    static String getUpperCase(String name) { //【1】
        return name.toUpperCase();
    }

    static String getGreeting(String name) { //【2】
        return "Hello, " + name;
    }
}
