public class Hello4 {

    public static void main(String[] args) {

        String personName = "Bob";

        Integer age = 35;

        Printer printer = new Printer();

        printer.printMessage("Hello! 私は" + personName + "、" + age + "歳です。");
    }
}