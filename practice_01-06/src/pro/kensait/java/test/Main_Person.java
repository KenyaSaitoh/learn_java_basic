package pro.kensait.java.test;

import pro.kensait.java.cuifw.ConsoleApplication;
import pro.kensait.java.cuifw.Model;
import pro.kensait.java.cuifw.Processor;

@Processor(PersonService.class)
@Model(value = Person.class, path = "model.csv")
public class Main_Person {
    public static void main(String[] args) {
        ConsoleApplication.run(Main_Person.class, args);
    }
}