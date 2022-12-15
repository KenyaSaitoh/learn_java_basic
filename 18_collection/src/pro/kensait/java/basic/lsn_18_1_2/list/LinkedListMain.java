package pro.kensait.java.basic.lsn_18_1_2.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListMain {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("foo");
        list.add("bar");
        list.add("baz");

        System.out.println("##### 最初の状態 #####");
        System.out.println(list);

        System.out.println("##### リストのサイズ #####");
        System.out.println("Size => " + list.size());

        System.out.println("##### 要素を挿入 #####");
        list.add(2, "foo");
        System.out.println(list);
        
        System.out.println("##### 要素を上書き #####");
        list.set(3, "qux");
        System.out.println(list);

        System.out.println("##### 要素の存在 #####");
        System.out.println("qux? => " + list.contains("qux"));

        System.out.println("##### 要素のインデックス #####");
        System.out.println("最初のfoo => " + list.indexOf("foo"));
        System.out.println("最後のfoo => " + list.lastIndexOf("foo"));

        System.out.println("##### 2つのリストを統合 #####");
        List<String> list2 = new ArrayList<>();
        list2.add("hoge");
        list2.add("piyo");
        list.addAll(list2);
        System.out.println(list);

        System.out.println("##### 要素を1件削除 #####");
        list.remove(1);
        System.out.println(list);

        System.out.println("##### 要素を全件削除 #####");
        list.clear();
        System.out.println("Empty? => " + list.isEmpty());
    }
}