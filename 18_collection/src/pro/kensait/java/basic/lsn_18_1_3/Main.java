package pro.kensait.java.basic.lsn_18_1_3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        {
            System.out.println("***** snippet_1 *****");
            Set<String> set = new HashSet<>();
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_2 *****");
            Set<String> set = new HashSet<>();
            set.add("foo");
            set.add("bar");
            set.add("baz");
            System.out.println(set);
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_3 *****");
            Person alice = new Person("Alice", 25, "female");
            Person bob = new Person("Bob", 35, "male");
            Set<Person> set = new HashSet<>();
            set.add(alice);
            set.add(bob);
            Person alice2 = new Person("Alice", 26, "female");
            set.add(alice2); // どうなる？
            System.out.println(set);
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_4 *****");
            Set<String> set = new HashSet<>();
            set.add("foo");
            set.add("bar");
            set.add("baz");
            boolean flag = set.remove("foo");
            System.out.println(set);
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_5 *****");
            Set<String> set = new HashSet<>();
            set.add("foo");
            set.add("bar");
            set.add("baz");
            set.clear();
            System.out.println(set);
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_6 *****");
            List<String> list = new ArrayList<>();
            list.add("foo");
            list.add("bar");
            list.add("baz");
            list.add("foo");
            System.out.println(list);
            Set<String> set = new HashSet<>(list);
            System.out.println(set);
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_7 *****");
            Set<String> set = new HashSet<>();
            set.add("foo");
            set.add("bar");
            set.add("baz");
            List<String> list = new ArrayList<>(set);
            System.out.println(list);
            System.out.println("=> end");
        }
    }
}