package pro.kensait.java.basic.lsn_18_1_4.map;

import java.util.Map;
import java.util.Set;

public class MapEntryMain {

    public static void main(String[] args) {
        // HashMapを作成する
        Map<Integer, String> map = Map.of(101, "Alice", 102, "Bob", 103, "Carol");

        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
        for (Map.Entry<Integer, String> entry : entrySet) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}