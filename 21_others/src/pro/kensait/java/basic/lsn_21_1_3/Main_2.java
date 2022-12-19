package pro.kensait.java.basic.lsn_21_1_3;

public class Main_2 {
	public static void main(String[] args) {
	    ScoreManager sm = new ScoreManager(90, 85, 70);
	    ScoreManager.ArrayIterator ai = sm.getIterator(); //【1】
	    System.out.println(ai.next());
	    System.out.println(ai.next());
	    System.out.println(ai.next());
	    ScoreManager.ArrayIterator ai2 = sm.getIterator(); //【2】改めて取り出す
	    System.out.println(ai2.next());
	}
}