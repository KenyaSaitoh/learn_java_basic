package pro.kensait.java.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main1 {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        Person alice = new Person("Alice", 25, "female");
        Person bob = new Person("Bob", 35, "male");
        Person carol = new Person("Carol", 30, "female");
        int val = alice.compareTo(bob);
        System.out.println(val);
        List<Person> list = new ArrayList<>();
        list.add(alice);
        list.add(bob);
        list.add(carol);
        Collections.sort(list);
        for (Person person : list) {
            System.out.println(person.getName());
        }

        Collections.sort(list, new PersonNameComparator());
        for (Person person : list) {
            System.out.println(person.getName());
        }
        System.out.println(list.get(0).getName());
    }
}
