package pro.kensait.java.basic.lsn_13_1_3.mutable;

import pro.kensait.java.basic.lsn_13_1_1.Person;

public class Main {
    public static void main(String[] args) {
        (new Main()).process();
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
