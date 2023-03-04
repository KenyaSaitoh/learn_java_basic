package pro.kensait.java.test;

import pro.kensait.java.cuifw.ConsoleApplication;
import pro.kensait.java.cuifw.Model;
import pro.kensait.java.cuifw.Processor;

@Processor(PersonService3.class)
@Model(value = Person3.class, path = "model3.csv")
public class Main_Person3 {
    public static void main(String[] args) {
        ConsoleApplication.run(Main_Person3.class, args);
    }
}