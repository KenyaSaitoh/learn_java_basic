package pro.kensait.java.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMain {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        // ArrayListを生成する。
        List list = new ArrayList();

        // ArrayListに要素を格納する。
        System.out.println("===== ArrayListに要素を格納 =====");
        list.add("Foo");
        list.add("Bar");
        list.add("Baz");
        System.out.println(list);

        // ArrayListの大きさを確認する。
        System.out.println("===== ArrayListの大きさ =====");
        System.out.println("Size ---> " + list.size());

        // ArrayListに要素を追加する。
        System.out.println("===== ArrayListに要素を追加 =====");
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

        // ArrayListから要素を1件削除する。
        System.out.println("===== ArrayListから要素を1件削除 =====");
        list.remove(1);
        System.out.println(list);

        // ArrayListから要素を全件削除する。
        System.out.println("===== ArrayListから要素を全件削除 =====");
        list.clear();
        System.out.println("Empty? ---> " + list.isEmpty());
    }
}