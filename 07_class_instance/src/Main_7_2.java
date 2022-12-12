public class Main_7_2 {
    public static void main(String[] args) {
        {
            System.out.println("***** snippet1 *****");
            Person2 p2 = new Person2();
            p2.name = "Alice";
            p2.age = 25;
            System.out.println("name => " + p2.name);
            System.out.println("age => " + p2.age);
        }
        {
            System.out.println("***** snippet2 *****");
            Printer printer = new Printer();
            printer.printMessage("Hello, Alice!", 5);
        }
        {
            System.out.println("***** snippet3 *****");
            Printer printer = new Printer();
            printer.printMessage("Hello, Alice!", 5);
            printer.printMessage("Goodbye, Bob!", 10);
        }
        {
            System.out.println("***** snippet4 *****");
            Calculator calc = new Calculator();
            int answer = calc.add(30, 10);
            System.out.println(answer);
        }
        {
            System.out.println("***** snippet5 *****");
            Person p = new Person("Alice", 25);
        }
    }
}