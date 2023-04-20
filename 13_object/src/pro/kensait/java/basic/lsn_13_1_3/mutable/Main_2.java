package pro.kensait.java.basic.lsn_13_1_3.mutable;

import pro.kensait.java.basic.lsn_13_1_1.Person;

public class Main_2 {
    public static void main(String[] args) {
        (new Main_2()).process();
    }

    void process() {
        Person person = new Person("Alice", 25, "中央区1-1-1");
        updateAddress(person); //【1】
        System.out.println(person); //【2】住所はどうなる？
    }

    void updateAddress(Person person) {
        person.setAddress("中央区2-2-2"); //【3】
    }
}
