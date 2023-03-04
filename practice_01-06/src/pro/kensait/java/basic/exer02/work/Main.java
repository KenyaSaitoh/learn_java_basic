package pro.kensait.java.basic.exer02.work;

import pro.kensait.java.cuifw.Array;
import pro.kensait.java.cuifw.ConsoleApplication;
import pro.kensait.java.cuifw.Processor;

@Processor(LoopService.class)
@Array(intArray = {34, 45, 432, 56, 3432, 454})
public class Main {
	public static void main(String[] args) {
	    ConsoleApplication.run(Main.class, args);
	}
}