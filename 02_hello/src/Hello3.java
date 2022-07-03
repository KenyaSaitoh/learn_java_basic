public class Hello3 {

    public static void main(String[] args) {

        String personName = "Alice";

        Integer age = 25;

        Printer printer = new Printer();

        printer.printMessage("Hello! 私は" + personName + "、" + age + "歳です。");
    }
}