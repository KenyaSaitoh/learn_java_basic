package pro.kensait.java.basic.lsn_13_1_3.mutable;

import pro.kensait.java.basic.lsn_13_1_1.Person;

public class Main_1 {
    public static void main(String[] args) {
        Person p1 = new Person("Alice", 25, "中央区1-1-1");
        Person p2 = p1;
        p2.setAddress("中央区2-2-2");
        System.out.println(p1.getAddress());
    }
}
