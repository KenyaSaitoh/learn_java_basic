package pro.kensait.java.basic.lsn_20_1_4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class Person {
    // フィールド
    private String name;
    private int age;
    private Date birthDay;
    // コンストラクタ
    public Person(String name, int age, Date birthDay) {
        this.name = name;
        this.age = age;
        this.birthDay = birthDay;
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
    public Date getBirthDay() {
        return birthDay;
    }
    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }
    public String getBirthDayStr() { //【1】生年月日を文字列で取得
        SimpleDateFormat df = new SimpleDateFormat("yyyy年M月d日");
        return df.format(birthDay);
    }
    public void setBirthDayStr(String birthDayStr) { //【2】生年月日を文字列で設定
        SimpleDateFormat df = new SimpleDateFormat("yyyy年M月d日");
        try {
        this.birthDay = df.parse(birthDayStr);
        } catch (ParseException pe) {
            new RuntimeException(pe);
        }
    }
    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", birthDay=" + birthDay + "]";
    }
    @Override
    public int hashCode() {
        return Objects.hash(age, birthDay, name);
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
        return age == other.age && Objects.equals(birthDay, other.birthDay)
                && Objects.equals(name, other.name);
    }
}