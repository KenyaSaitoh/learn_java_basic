package pro.kensait.java.test;

import pro.kensait.java.cuifw.ModelInfo;

public class Person2 {
    public static enum GenderType {
        MALE, FEMALE;
    }
    // フィールド
    @ModelInfo(order = 1) private String name;
    @ModelInfo(order = 2) private int age;
    @ModelInfo(order = 3) private GenderType gender;
    // コンストラクタ
    public Person2(String name, int age, GenderType gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public Person2() {
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
    public GenderType getGender() {
        return gender;
    }
    public void setGender(GenderType gender) {
        this.gender = gender;
    }
    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
    }
}