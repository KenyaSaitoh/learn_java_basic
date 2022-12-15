package pro.kensait.java.basic.lsn_18_1_2.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMain {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("foo");
        list.add("bar");
        list.add("baz");
        list.add("qux");
        /*
        for (String str : list) {
            if (str.equals("bar")) {
                list.remove("bar");
            }
        }
        */

        System.out.println(list);
        /*
        Iterator<String> iter = list.iterator();
        while (iter.hasNext()) {
            String str = iter.next();
            System.out.println(str);
            if (str.equals("bar")) {
                list.remove("bar");
            }
        }
        */

        System.out.println(list);
        //System.exit(0);

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

        // 配列化、ここに入れた意味はないので後で移動する
        String[] array = list.toArray(new String[0]);
        for (String str : array) {
            System.out.println(str);
        }

        System.out.println("##### 要素を1件削除 #####");
        list.remove(1);
        System.out.println(list);

        System.out.println("##### 要素を全件削除 #####");
        list.clear();
        System.out.println("Empty? => " + list.isEmpty());
        

    }
}