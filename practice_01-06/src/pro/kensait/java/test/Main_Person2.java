package pro.kensait.java.test;

import pro.kensait.java.cuifw.ConsoleApplication;
import pro.kensait.java.cuifw.Model;
import pro.kensait.java.cuifw.Processor;

@Processor(PersonService2.class)
@Model(value = Person2.class, path = "model2.csv")
public class Main_Person2 {
    public static void main(String[] args) {
        ConsoleApplication.run(Main_Person2.class, args);
    }
}