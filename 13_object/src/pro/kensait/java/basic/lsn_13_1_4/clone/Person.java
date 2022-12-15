package pro.kensait.java.basic.lsn_13_1_4.clone;

public class Person implements Cloneable {
    // フィールド
    private String name;
    private int age;
    private Address address;
    // コンストラクタ
	public Person(String name, int age, Address address) {
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
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", address=" + address + "]";
    }
    @Override
    public Person clone() throws CloneNotSupportedException {
        Person copy = (Person)super.clone();
        copy.address = this.address.clone();
        return copy;
    }
}