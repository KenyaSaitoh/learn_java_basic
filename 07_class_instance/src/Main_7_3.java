public class Main_7_3 {
    public static void main(String[] args) {
        {
            System.out.println("***** snippet1 *****");
            CalcForVariableParams calc = new CalcForVariableParams();
            int answer = calc.add(15, 5, 30, 10); // いくつでも指定可能
        }
        {
            System.out.println("***** snippet2 *****");
            Person3 p = new Person3("Alice", 25);
            if (p.createGreetMessage("JAPANESE").startsWith("おはよう")) {
            }
        }
        {
            System.out.println("***** snippet3 *****");
            Person3 p = new Person3("Alice");
            p.withAge(25).withNationality("JAPAN");
        }
        {
            System.out.println("***** snippet4 *****");
            Person3 p = (new Person3("Alice")).withAge(25).withNationality("JAPAN");
        }
        {
            System.out.println("***** snippet5 *****");
            Calculator calc = new Calculator();
            int answer = calc.add(30, 10);
        }
        {
            System.out.println("***** snippet6 *****");
            StatefulCalc calc = new StatefulCalc(30, 10);
            int answer = calc.add();
        }
    }
}