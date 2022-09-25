package pro.kensait.java.basic.lesson18_1_4.map;

public class Person {
    // フィールド
    private Integer id;
    private String name;
    private int age;
    private String gender;
    // コンストラクタ
    public Person(Integer id, String name, int age, String gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    // アクセサメソッド
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
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
}