package pro.kensait.java.basic.lesson18_2_1.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main2 {

    public static void main(String[] args) {
        Person alice = new Person("Alice", 25, "female");
        Person bob = new Person("Bob", 35, "male");
        Person carol = new Person("Carol", 30, "female");
        List<Person> list = new ArrayList<>();
        list.add(alice);
        list.add(bob);
        list.add(carol);

        Collections.sort(list);
        for (Person person : list) {
            System.out.println(person);
        }

        Collections.sort(list, new PersonNameComparator());
        for (Person person : list) {
            System.out.println(person);
        }
    }
}
