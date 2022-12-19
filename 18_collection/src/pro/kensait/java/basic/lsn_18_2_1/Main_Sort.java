package pro.kensait.java.basic.lsn_18_2_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main_Sort {
    public static void main(String[] args) {
        {
            System.out.println("***** snippet_1 *****");
            List<Integer> list = new ArrayList<>();
            list.add(5);
            list.add(10);
            list.add(3);
            Collections.sort(list);
            System.out.println(list);
        }
        {
            System.out.println("***** snippet_2 *****");
            Person alice = new Person("Alice", 25, "female");
            Person bob = new Person("Bob", 35, "male");
            Person carol = new Person("Carol", 30, "female");
            List<Person> list = new ArrayList<>();
            list.add(alice);
            list.add(bob);
            list.add(carol);
            Collections.sort(list);
            System.out.println(list);
        }
        {
            System.out.println("***** snippet_3 *****");
            Person alice = new Person("Alice", 25, "female");
            Person bob = new Person("Bob", 35, "male");
            Person carol = new Person("Carol", 30, "female");
            List<Person> list = new ArrayList<>();
            list.add(alice);
            list.add(bob);
            list.add(carol);
            Collections.sort(list, new PersonNameComparator());
            System.out.println(list);
        }
        {
            System.out.println("***** snippet_4 *****");
            List<Integer> list = new ArrayList<>();
            list.add(5);
            list.add(10);
            list.add(3);
            Collections.sort(list, Collections.reverseOrder());
            System.out.println(list);
        }
    }
}
