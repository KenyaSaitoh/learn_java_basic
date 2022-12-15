public class Main_7_3 {
    public static void main(String[] args) {
        {
            System.out.println("***** snippet_7_3_10 *****");
            CalcForVariableParams calc = new CalcForVariableParams();
            int answer = calc.add(15, 5, 30, 10); // いくつでも指定可能
        }
        {
            System.out.println("***** snippet_7_3_14 *****");
            Person3 p = new Person3("Alice", 25);
            if (p.createGreetMessage("JAPANESE").startsWith("おはよう")) {
            }
        }
        {
            System.out.println("***** snippet_7_3_16 *****");
            Person3 p = new Person3("Alice");
            p.withAge(25).withNationality("JAPAN");
        }
        {
            System.out.println("***** snippet_7_3_17 *****");
            Person3 p = (new Person3("Alice")).withAge(25).withNationality("JAPAN");
        }
        {
            System.out.println("***** snippet_7_3_18 *****");
            Calculator calc = new Calculator();
            int answer = calc.add(30, 10);
        }
        {
            System.out.println("***** snippet_7_3_19 *****");
            StatefulCalc calc = new StatefulCalc(30, 10);
            int answer = calc.add();
        }
    }
}