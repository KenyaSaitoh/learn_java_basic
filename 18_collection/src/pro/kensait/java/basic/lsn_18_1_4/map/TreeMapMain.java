package pro.kensait.java.basic.lsn_18_1_4.map;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapMain {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        // TreeMapを生成する。
        Map map = new TreeMap();

        // TreeMapに要素を格納する。
        System.out.println("##### TreeMapに要素を格納 #####");
        map.put("Key1", "foo");
        map.put("Key2", "bar");
        map.put("Key3", "baz");
        System.out.println(map);

        // TreeMapの大きさを確認する。
        System.out.println("##### TreeMapの大きさ #####");
        System.out.println("Size => " + map.size());

        // Key2の値を変更する。
        System.out.println("##### Key2の値を変更 #####");
        map.put("Key2", "qux");
        System.out.println(map);

        // キー・値の存在を確認する。
        System.out.println("##### キー・値の存在 #####");
        System.out.println("キーKey1は含まれているか => " +
                map.containsKey("Key1"));
        System.out.println("値Fooは含まれているか => " +
                map.containsValue("foo"));

        // TreeMapからキーのセットを取得する。
        System.out.println("##### TreeMapからキーのセットを取得 #####");
        Set set = map.keySet();
        System.out.println(set);

        // TreeMapから値のコレクションを取得する。
        System.out.println("##### TreeMapから値のコレクションを取得 #####");
        Collection col = map.values();
        System.out.println(col);

        // TreeMapから値を1件削除する。
        System.out.println("##### TreeMapから値を1件削除 #####");
        map.remove("Key1");
        System.out.println(map);

        // TreeMapから値を全件削除する。
        System.out.println("##### TreeMapから値を全件削除 #####");
        map.clear();
        System.out.println("Empty? => " + map.isEmpty());
    }
}