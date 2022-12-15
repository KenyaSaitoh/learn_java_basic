package pro.kensait.java.basic.lsn_21_2_2;

import java.util.Map;
import java.util.Optional;

public class PersonDBSearcher {
    public Person find1(String name) {
        Person person = personDB.get(name);
        return person;
    }

    public Optional<Person> find2(String name) {
        Person person = personDB.get(name);
        if (person == null) {
            return Optional.empty();
        }
        return Optional.of(person);
    }

    public Optional<Person> find3(String name) {
        Person person = personDB.get(name);
        return Optional.ofNullable(person);
    }

    private static Map<String, Person> personDB =
            Map.of("Alice", new Person("Alice", 25, "female"),
                    "Bab",new Person("Bob", 35, "male"),
                    "Carol", new Person("Carol", 25, "female"));
}
