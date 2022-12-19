package pro.kensait.java.basic.lsn_21_2_2;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        {
            System.out.println("***** snippet_1 *****");
            PersonDBSearcher pds = new PersonDBSearcher();
            Optional<Person> opt = pds.find2("Dave");
            if (opt.isEmpty()) {
                System.out.println("empty");
            } else {
                Person person = opt.get();
                System.out.println(person);
            }
        }
        {
            System.out.println("***** snippet_2 *****");
            PersonDBSearcher pds = new PersonDBSearcher();
            Optional<Person> opt = pds.find2("Dave");
            Person p1 = opt.orElse(new Person());
            //Person p2 = opt.orElseThrow();
            //Person p3 = opt.orElseThrow(() -> new RuntimeException("Daveは存在せず"));
            System.out.println(p1);
            //System.out.println(p2);
            //System.out.println(p3);
        }
    }
}