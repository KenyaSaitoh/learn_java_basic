package pro.kensait.java.basic.lesson21_1_2;

import java.util.Map;

public class PersonFileSearcher {
    public Person find(String name) {
        return personMap.get(name);
    }

    private static Map<String, Person> personMap =
            Map.of("Alice", new Person("Alice", 25, "female"),
                    "Dave", new Person("Dave", 23, "male"));
}
