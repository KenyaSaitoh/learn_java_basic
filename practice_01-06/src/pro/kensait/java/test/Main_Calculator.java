package pro.kensait.java.test;

import pro.kensait.java.cuifw.ConsoleApplication;
import pro.kensait.java.cuifw.Processor;

@Processor(Calculator.class)
public class Main_Calculator {
    public static void main(String[] args) {
        ConsoleApplication.run(Main_Calculator.class, args);
    }
}