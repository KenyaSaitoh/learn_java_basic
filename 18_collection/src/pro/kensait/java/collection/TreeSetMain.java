package pro.kensait.java.collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetMain {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        // TreeSetを生成する。
        TreeSet set = new TreeSet();

        // TreeSetに要素を格納する。
        System.out.println("##### TreeSetに要素を格納 #####");
        set.add("Foo");
        set.add("Bar");
        set.add("Baz");
        System.out.println(set);

        // TreeSetの大きさを確認する。
        System.out.println("##### TreeSetの大きさ #####");
        System.out.println("Size ---> " + set.size());

        // TreeSetに要素を追加する。
        System.out.println("##### TreeSetに要素を追加 #####");
        set.add("Qux");
        System.out.println(set);

        // TreeSetから部分集合を取り出す。
        System.out.println("##### Fooより大きいTreeSetを取り出す #####");
        SortedSet subSet = set.tailSet("Foo");
        System.out.println(subSet);

        // 要素の存在を確認する。
        System.out.println("##### 要素の存在 #####");
        System.out.println("Fooは含まれているか ---> " + set.contains("Foo"));

        // TreeSetから要素を1件削除する。
        System.out.println("##### TreeSetから要素を1件削除 #####");
        set.remove("Foo");
        System.out.println(set);

        // TreeSetから要素を全件削除する。
        System.out.println("##### TreeSetから要素を全件削除 #####");
        set.clear();
        System.out.println("Empty? ---> " + set.isEmpty());
    }
}