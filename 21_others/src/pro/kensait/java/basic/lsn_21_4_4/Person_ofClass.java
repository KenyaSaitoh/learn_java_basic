package pro.kensait.java.basic.lsn_21_4_4;

import java.util.Objects;

public class Person_ofClass {
    // フィールド
    private final String name;
    private final int age;
    private final String gender;
    // コンストラクタ
    public Person_ofClass(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    // アクセサメソッド（ゲッターのみ）
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getGender() {
        return gender;
    }
    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
    }
    @Override
    public int hashCode() {
        return Objects.hash(age, gender, name);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person_ofClass other = (Person_ofClass) obj;
        return age == other.age && Objects.equals(gender, other.gender)
                && Objects.equals(name, other.name);
    }
}
