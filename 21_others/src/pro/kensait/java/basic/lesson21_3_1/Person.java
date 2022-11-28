package pro.kensait.java.basic.lesson21_3_1;

import java.util.Objects;

public class Person {
    // フィールド
    private String name;
    private int age;
    private String address;
    // コンストラクタ
    public Person() {
    }
	public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
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
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    @Override
    public int hashCode() {
        return Objects.hash(address, age, name);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        return Objects.equals(address, other.address) && age == other.age
                && Objects.equals(name, other.name);
    }

}