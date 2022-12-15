package pro.kensait.java.basic.lsn_13_1_3.immutable;

public class Person {
    // フィールド
    final private String name;
    final private int age;
    final private String address;
    // コンストラクタ
	public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    // アクセサメソッド
    public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
    public String getAddress() {
        return address;
    }
}