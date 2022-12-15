package pro.kensait.java.basic.lsn_21_4_4;

import java.util.HashSet;
import java.util.Set;

public class Main_HashSet {
    public static void main(String[] args) {
        Person alice = new Person("Alice", 25, "female");
        Person bob = new Person("Bob", 35, "male");
        Person carol = new Person("Carol", 30, "female");
        Set<Person> set = new HashSet<>();
        set.add(alice);
        set.add(bob);
        set.add(carol);

        Person alice2 = new Person("Alice", 25, "female");
        System.out.println(set.add(alice2));
        System.out.println(set);
    }
}