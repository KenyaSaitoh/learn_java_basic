package pro.kensait.java.basic.lsn_21_2_2;

import java.util.Map;
import java.util.Optional;

public class PersonDBSearcher {
    public Person find(String name) {
        Person person = personDB.get(name); // 【1】
        return person;
    }

    public Optional<Person> find2(String name) { //【1】
        Person person = personDB.get(name);
        if (person == null) {
            return Optional.empty(); //【2】
        }
        return Optional.of(person); //【3】
    }

    public Optional<Person> find3(String name) {
        Person person = personDB.get(name);
        return Optional.ofNullable(person);
    }

    private static Map<String, Person> personDB = //【2】
            Map.of("Alice", new Person("Alice", 25, "female"),
                    "Bab", new Person("Bob", 35, "male"),
                    "Carol", new Person("Carol", 25, "female"));
}
