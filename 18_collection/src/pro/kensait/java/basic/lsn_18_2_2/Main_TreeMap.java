package pro.kensait.java.basic.lsn_18_2_2;

import java.util.SortedMap;
import java.util.TreeMap;

import pro.kensait.java.basic.lsn_18_1_4.Person;

public class Main_TreeMap {
    public static void main(String[] args) {
        // Personを格納するためのマップを作成する
        Person alice = new Person(101, "Alice", 25, "female");
        Person bob = new Person(102, "Bob", 35, "male");
        Person carol = new Person(103, "Carol", 30, "female");
        SortedMap<Integer, Person> personMap = new TreeMap<>();
        personMap.put(alice.getId(), alice);
        personMap.put(bob.getId(), bob);
        personMap.put(carol.getId(), carol);

        // サブマップを作る
        SortedMap<Integer, Person> hm = personMap.headMap(102);
        System.out.println(hm);
        SortedMap<Integer, Person> tm = personMap.tailMap(102);
        System.out.println(tm);
    }
}