package pro.kensait.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsMain {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        // リストを生成する。
        List list = new ArrayList();

        // リストに要素を登録する。
        System.out.println("##### リストに要素を登録 #####");
        list.add("E");
        list.add("B");
        list.add("D");
        list.add("C");
        list.add("A");
        System.out.println(list);

        // リストを自然順序付けでソートする。
        System.out.println("##### リストを自然順序付けでソート #####");
        Collections.sort(list);
        System.out.println(list);

        // リストを左回りに3つ回転する。
        System.out.println("##### リストを左回りに3つ回転 #####");
        Collections.rotate(list, -3);
        System.out.println(list);

        // リストをシャッフルする。
        System.out.println("##### リストをシャッフル #####");
        Collections.shuffle(list);
        System.out.println(list);

        // リストを反転する。
        System.out.println("##### リストを反転 #####");
        Collections.reverse(list);
        System.out.println(list);

        // リストを自然順序付けの逆順にソートする。
        System.out.println("##### リストを自然順序付けの逆順にソート #####");
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}