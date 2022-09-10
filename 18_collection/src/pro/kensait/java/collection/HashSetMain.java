package pro.kensait.java.collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetMain {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        // HashSetを生成する。
        Set set = new HashSet();

        // HashSetに要素を格納する。
        System.out.println("##### HashSetに要素を格納 #####");
        set.add("Foo");
        set.add("Bar");
        set.add("Baz");
        System.out.println(set);

        // HashSetの大きさを確認する。
        System.out.println("##### HashSetの大きさ #####");
        System.out.println("Size ---> " + set.size());

        // HashSetに要素を追加する。
        System.out.println("##### HashSetに要素を追加 #####");
        set.add("Qux");
        set.add("Hoge");
        System.out.println(set);

        // 要素の存在を確認する。
        System.out.println("##### 要素の存在 #####");
        System.out.println("Fooは含まれているか ---> " + set.contains("Foo"));

        // HashSetから要素を1件削除する。
        System.out.println("##### HashSetから要素を1件削除 #####");
        set.remove("Foo");
        System.out.println(set);

        // HashSetから要素を全件削除する。
        System.out.println("##### HashSetから要素を全件削除 #####");
        set.clear();
        System.out.println("Empty? ---> " + set.isEmpty());
    }
}