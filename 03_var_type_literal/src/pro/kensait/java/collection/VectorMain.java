package pro.kensait.java.collection;

import java.util.Vector;

public class VectorMain {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        // Vectorを生成する。
        Vector vec = new Vector();

        // Vectorに要素を格納する。
        System.out.println("===== Vectorに要素を格納 =====");
        vec.addElement("Foo");
        vec.addElement("Bar");
        vec.addElement("Baz");
        System.out.println(vec);

        // Vectorの大きさを確認する。
        System.out.println("===== Vectorの大きさ =====");
        System.out.println("Vector Size ---> " + vec.size());

        // Vectorに要素を追加する。
        System.out.println("===== Vectorに要素を追加 =====");
        vec.add(2, "Foo");
        vec.set(3, "Hoge");
        System.out.println(vec);

        // 要素の存在を確認する。
        System.out.println("===== 要素の存在 =====");
        System.out.println("Hogeは含まれているか ---> " + vec.contains("Hoge"));

        // 要素の位置を表示する。
        System.out.println("===== 要素の位置 =====");
        System.out.println("最初のBarの位置 ---> " + vec.indexOf("Foo"));
        System.out.println("最初のBarの位置 ---> " + vec.lastIndexOf("Foo"));

        // Vectorから要素を1件削除する。
        System.out.println("===== Vectorから要素を1件削除 =====");
        vec.remove(1);
        System.out.println(vec);

        // Vectorから要素を全件削除する。
        System.out.println("===== Vectorから要素を全件削除 =====");
        vec.clear();
        System.out.println("Empty? ---> " + vec.isEmpty());
    }
}