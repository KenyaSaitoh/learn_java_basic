package pro.kensait.java.basic.lesson18_1_4.map;

import java.util.HashMap;
import java.util.Map;

public class PersonMapMain {
    public static void main(String[] args) {
        Person alice = new Person(101, "Alice", 25, "female");
        Person bob = new Person(102, "Bob", 35, "male");
        Person carol = new Person(103, "Carol", 30, "female");
        Map<Integer, Person> personMap = new HashMap<>();
        personMap.put(alice.getId(), alice);
        personMap.put(bob.getId(), bob);
        personMap.put(carol.getId(), carol);
        Person person = personMap.get(102);
    }
}