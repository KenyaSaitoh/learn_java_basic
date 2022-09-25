package pro.kensait.java.basic.lesson18_2_2.tree;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetMain2 {

    public static void main(String[] args) {
        // TreeSetを生成する。
        SortedSet<Person> set = new TreeSet<Person>();

        // TreeSetに要素を格納する。
        System.out.println("##### TreeSetに要素を格納 #####");
        Person alice = new Person("Alice", 25, "female");
        Person bob = new Person("Bob", 35, "male");
        Person carol = new Person("Carol", 30, "female");
        set.add(alice);
        set.add(bob);
        set.add(carol);
        System.out.println(set);

        // TreeSetの大きさを確認する。
        System.out.println("##### TreeSetの大きさ #####");
        System.out.println("Size => " + set.size());

        // TreeSetから部分集合を取り出す。
        System.out.println("##### Fooより大きいTreeSetを取り出す #####");
        SortedSet<Person> headSet = set.headSet(bob);
        System.out.println(headSet);
        SortedSet<Person> tailSet = set.tailSet(bob);
        System.out.println(tailSet);

        // 要素の存在を確認する。
        System.out.println("##### 要素の存在 #####");
        System.out.println("Fooは含まれているか => " + set.contains(bob));

        // TreeSetから要素を1件削除する。
        System.out.println("##### TreeSetから要素を1件削除 #####");
        set.remove(bob);
        System.out.println(set);

        // TreeSetから要素を全件削除する。
        System.out.println("##### TreeSetから要素を全件削除 #####");
        set.clear();
        System.out.println("Empty? => " + set.isEmpty());
    }
}