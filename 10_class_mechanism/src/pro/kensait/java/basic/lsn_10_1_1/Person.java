package pro.kensait.java.basic.lsn_10_1_1;

public class Person {
    // フィールド
    private String name;
    private int age;
    // コンストラクタ
    public Person() {
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
	// アクセサメソッド
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}