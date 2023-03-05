package pro.kensait.java.basic.exer_122.work;

import pro.kensait.java.cuifw.ConsoleApplication;
import pro.kensait.java.cuifw.Data;
import pro.kensait.java.cuifw.Processor;

@Processor(LoopService.class)
@Data(intData = {34, 45, 432, 56, 3432, 454})
public class Main {
	public static void main(String[] args) {
	    ConsoleApplication.run(Main.class, args);
	}
}