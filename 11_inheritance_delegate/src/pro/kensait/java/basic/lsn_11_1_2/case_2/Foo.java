package pro.kensait.java.basic.lsn_11_1_2.case_2;

public class Foo {
	public int base = 100;
    private int x;
    public Foo(int x) {
        this.x = x;
    }
    public int getX() {
        return x;
    }
	public int add() {
		return base + x;
	}
}