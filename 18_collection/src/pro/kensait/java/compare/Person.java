package pro.kensait.java.compare;

public class Person implements Comparable<Person> {
    // フィールド
    private String name;
    private int age;
    private String gender;
    // コンストラクタ
    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    @Override
    public int compareTo(Person other) {
        return Integer.compare(age, other.getAge());
        /*
        if (age < other.getAge()) return -1;
        if (other.getAge() < age) return 1;
        return 0;
        */
    }
}