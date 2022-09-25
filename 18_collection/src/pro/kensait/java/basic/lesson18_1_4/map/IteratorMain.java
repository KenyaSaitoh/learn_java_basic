package pro.kensait.java.basic.lesson18_1_4.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class IteratorMain {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        // HashMapを生成する。
        Map map = new HashMap();

        // HashMapに要素を格納する。
        System.out.println("##### HashMapに要素を格納 #####");
        map.put("Key1", "foo");
        map.put("Key2", "bar");
        map.put("Key3", "baz");
        map.put("Key4", "qux");
        System.out.println(map);

        // HashMapからキーのセットを取得する。
        System.out.println("##### HashMapからキーのセットを取得 #####");
        Set set = map.keySet();
        System.out.println(set);

        // キーのセットから要素を取り出す。
        System.out.println("##### キーのセットから要素を取り出す #####");
        Iterator i = set.iterator();
        while (i.hasNext()) {
            String key = (String)i.next();
            String value = (String)map.get(key);
            System.out.println(key + " => " + value);
        }
    }
}