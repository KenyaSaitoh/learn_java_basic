package pro.kensait.java.basic.lsn_21_1_1.member;

public class Client {
	public static void main(String[] args) {
		ScoreManager m = new ScoreManager(90, 85, 70);
		ScoreManager.ArrayIterator i = m.getIterator();
		System.out.println(i.next());
		System.out.println(i.next());
		System.out.println(i.next());
	}
}
