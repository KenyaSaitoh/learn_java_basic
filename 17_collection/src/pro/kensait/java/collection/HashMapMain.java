package pro.kensait.java.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapMain {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        // HashMapを生成する。
        Map map = new HashMap();

        // HashMapに要素を格納する。
        System.out.println("===== HashMapに要素を格納 =====");
        map.put("Key1", "Foo");
        map.put("Key2", "Bar");
        map.put("Key3", "Baz");
        System.out.println(map);

        // HashMapの大きさを確認する。
        System.out.println("===== HashMapの大きさ =====");
        System.out.println("Size ---> " + map.size());

        // Key2の値を変更する。
        System.out.println("===== Key2の値を変更 =====");
        map.put("Key2", "Qux");
        System.out.println(map);

        // キー・値の存在を確認する。
        System.out.println("===== キー・値の存在 =====");
        System.out.println("キーKey1は含まれているか ---> " +
                map.containsKey("Key1"));
        System.out.println("値Fooは含まれているか ---> " +
                map.containsValue("Foo"));

        // HashMapからキーのセットを取得する。
        System.out.println("===== HashMapからキーのセットを取得 =====");
        Set set = map.keySet();
        System.out.println(set);

        // HashMapから値のコレクションを取得する。
        System.out.println("===== HashMapから値のコレクションを取得 =====");
        Collection col = map.values();
        System.out.println(col);

        // HashMapから値を1件削除する。
        System.out.println("===== HashMapから値を1件削除 =====");
        map.remove("Key1");
        System.out.println(map);

        // HashMapから値を全件削除する。
        System.out.println("===== HashMapから値を全件削除 =====");
        map.clear();
        System.out.println("Empty? ---> " + map.isEmpty());
    }
}