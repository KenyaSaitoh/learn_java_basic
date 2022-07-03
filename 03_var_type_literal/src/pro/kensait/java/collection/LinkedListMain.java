package pro.kensait.java.collection;

import java.util.LinkedList;
import java.util.List;

public class LinkedListMain {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        // LinkedListを生成する。
        List list = new LinkedList();

        // LinkedListに要素を格納する。
        System.out.println("===== LinkedListに要素を格納 =====");
        list.add("Foo");
        list.add("Bar");
        list.add("Baz");
        System.out.println(list);

        // LinkedListの大きさを確認する。
        System.out.println("===== LinkedListの大きさ =====");
        System.out.println("Size ---> " + list.size());

        // LinkedListに要素を追加する。
        System.out.println("===== LinkedListに要素を追加 =====");
        list.add(2, "Foo");
        list.set(3, "Hoge");
        System.out.println(list);

        // 要素の存在を確認する。
        System.out.println("===== 要素の存在 =====");
        System.out.println("Hogeは含まれているか ---> " + list.contains("Hoge"));

        // 要素の位置を表示する。
        System.out.println("===== 要素の位置 =====");
        System.out.println("最初のFooの位置 ---> " + list.indexOf("Foo"));
        System.out.println("最後のFooの位置 ---> " + list.lastIndexOf("Foo"));

        // LinkedListから要素を1件削除する。
        System.out.println("===== LinkedListから要素を1件削除 =====");
        list.remove(1);
        System.out.println(list);

        // LinkedListから要素を全件削除する。
        System.out.println("===== LinkedListから要素を全件削除 =====");
        list.clear();
        System.out.println("Empty? ---> " + list.isEmpty());
    }
}