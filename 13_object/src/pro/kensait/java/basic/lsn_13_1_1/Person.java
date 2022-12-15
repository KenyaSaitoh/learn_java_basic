package pro.kensait.java.basic.lsn_13_1_1;

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
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", address=" + address + "]";
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
        if (name == null) {
            if (other.name != null) {
                return false;
            }
        } else if (! name.equals(other.name)) {
            return false;
        }
        if (age != other.age) {
            return false;
        }
        if (address == null) {
            if (other.address != null) {
                return false;
            }
        } else if (! address.equals(other.address)) {
            return false;
        }
        return true;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + age;
        result = prime * result + ((address == null) ? 0 : address.hashCode());
        return result;
    }
}