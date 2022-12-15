package pro.kensait.java.basic.lsn_18_1_4.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapMain {

    public static void main(String[] args) {
        // HashMapを生成する
        Map<Integer, String> map = new HashMap<>();

        System.out.println("##### 要素を格納 #####");
        map.put(101, "Alice");
        map.put(102, "Bob");
        map.put(103, "Carol");
        System.out.println(map);

        Set<Integer> keySet = map.keySet();
        for (Integer key : keySet) {
            String value = map.get(key);
        }
        
        System.out.println(keySet);
        Collection<String> values = map.values();
        System.out.println(values);
        for (String value : values) {
            System.out.println(value);
        }
        
        System.out.println("##### キー=101の値の取得 #####");
        System.out.println("101 => " + map.get(101));

        System.out.println("##### HashMapの大きさ #####");
        System.out.println("Size => " + map.size());

        System.out.println("##### キー=102の値を変更 #####");
        map.put(102, "Dave");
        System.out.println(map);

        System.out.println("##### キー・値の存在確認 #####");
        System.out.println("キー101は含まれているか => " +
                map.containsKey(101));
        System.out.println("値Aliceは含まれているか => " +
                map.containsValue("Alice"));

        System.out.println("##### キーのセットを取得 #####");
        Set<Integer> set = map.keySet();
        System.out.println(set);

        System.out.println("##### 値のコレクションを取得 #####");
        Collection<String> col = map.values();
        System.out.println(col);

        System.out.println("##### HashMapから値を1件削除 #####");
        map.remove(101);
        System.out.println(map);

        System.out.println("##### HashMapから値を全件削除 #####");
        map.clear();
        System.out.println("Empty? => " + map.isEmpty());
    }
}