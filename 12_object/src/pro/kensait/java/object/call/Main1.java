package pro.kensait.java.object.call;

import pro.kensait.java.object.tostring.Person;

public class Main1 {
    public static void main(String[] args) {
        (new Main1()).process();
    }

    void process() {
        Person person = new Person("Alice", 25, "中央区1-1-1");
        updateAddress(person);
        System.out.println(person); // 住所はどうなる？
    }

    void updateAddress(Person person) {
        person.setAddress("中央区2-2-2");
    }
}
