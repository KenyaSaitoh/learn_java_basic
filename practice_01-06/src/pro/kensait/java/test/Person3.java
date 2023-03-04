package pro.kensait.java.test;

import pro.kensait.java.cuifw.ModelInfo;

public class Person3 {
    public static enum GenderType {
        MALE, FEMALE;
    }
    // フィールド
    @ModelInfo(order = 1) private String name;
    @ModelInfo(order = 2) private int age;
    @ModelInfo(order = 3) private GenderType gender;
    @ModelInfo(order = 4) private boolean isBusinessPerson;
    @ModelInfo(order = 5) private double height;

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
    public boolean getIsBusinessPerson() {
        return isBusinessPerson;
    }
    public void setIsBusinessPerson(boolean isBusinessPerson) {
        this.isBusinessPerson = isBusinessPerson;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    @Override
    public String toString() {
        return "Person3 [name=" + name + ", age=" + age + ", gender=" + gender
                + ", isBusinessPerson=" + isBusinessPerson + ", height=" + height + "]";
    }
}