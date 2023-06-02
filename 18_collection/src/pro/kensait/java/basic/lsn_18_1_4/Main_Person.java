package pro.kensait.java.basic.lsn_18_1_4;

import java.util.HashMap;
import java.util.Map;

public class Main_Person {
    public static void main(String[] args) {
        // Alice、Bob、Carol、3つのPersonインスタンスを生成
        Person alice = new Person(101, "Alice", 25, "female");
        Person bob = new Person(102, "Bob", 35, "male");
        Person carol = new Person(103, "Carol", 30, "female");

        // マップを生成
        Map<Integer, Person> personMap = new HashMap<>(); //【1】

        // Alice、Bob、Carol、3つのPersonインスタンスをマップに追加
        personMap.put(alice.getId(), alice);
        personMap.put(bob.getId(), bob);
        personMap.put(carol.getId(), carol);

        // ID102をキーに指定して、マップからPersonインスタンスを取り出す
        Person person = personMap.get(102);
        System.out.println(person);
    }
}