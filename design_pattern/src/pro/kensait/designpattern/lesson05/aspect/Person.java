package pro.kensait.designpattern.lesson05.aspect;

public class Person {

    private String personName;
    private Integer age;
    private String gender;

    public Person() {
    }

    public Person(String personName, Integer age, String gender) {
        this.personName = personName;
        this.age = age;
        this.gender = gender;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void sayHello() {
        String message = "Hello! 私は" + personName + "、" + age + "歳です";
        if (isAdult()) message += "私は成人です";
        System.out.println(message);
    }

    private boolean isAdult() {
        return 20 <= age;
    }
}