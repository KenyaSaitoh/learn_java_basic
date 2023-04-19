package pro.kensait.java.basic.lsn_18_1_4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        {
            System.out.println("***** snippet_1 *****");
            Map<Integer, String> map = new HashMap<>();
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_2 *****");
            Map<Integer, String> map = new HashMap<>();
            map.put(101, "Alice");
            map.put(102, "Bob");
            map.put(103, "Carol");
            System.out.println(map);
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_3 *****");
            Map<Integer, String> map = new HashMap<>();
            map.put(101, "Alice");
            map.put(102, "Bob");
            map.put(103, "Carol");
            map.put(102, "Dave");
            System.out.println(map);
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_4 *****");
            Map<Integer, String> map = new HashMap<>();
            map.put(101, "Alice");
            map.put(102, "Bob");
            map.put(103, "Carol");
            String name = map.get(101);
            System.out.println(name);
            System.out.println("=> end");
        }

        {
            System.out.println("***** snippet_5 *****");
            Map<Integer, String> map = new HashMap<>();
            map.put(101, "Alice");
            map.put(102, "Bob");
            map.put(103, "Carol");
            Set<Integer> keySet = map.keySet();
            System.out.println(keySet);
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_6 *****");
            Map<Integer, String> map = new HashMap<>();
            map.put(101, "Alice");
            map.put(102, "Bob");
            map.put(103, "Carol");
            Collection<String> values = map.values();
            List<String> list = new ArrayList<>(values);
            Set<String> set = new HashSet<>(values);
            System.out.println(list);
            System.out.println(set);
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_7 *****");
            Map<Integer, String> map = new HashMap<>();
            map.put(101, "Alice");
            map.put(102, "Bob");
            map.put(103, "Carol");
            Set<Integer> keySet = map.keySet();
            for (Integer key : keySet) {
                String value = map.get(key);
                System.out.println(value);
            }
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_8 *****");
            Map<Integer, String> map = new HashMap<>();
            map.put(101, "Alice");
            map.put(102, "Bob");
            map.put(103, "Carol");
            Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
            for (Map.Entry<Integer, String> entry : entrySet) {
                System.out.println(entry.getKey() + " => " +
                        entry.getValue());
            }
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_9 *****");
            Map<Integer, String> map = new HashMap<>();
            map.put(101, "Alice");
            map.put(102, "Bob");
            map.put(103, "Carol");
            boolean flag = map.remove(101, "Alice");
            System.out.println(map);
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_10 *****");
            Map<Integer, String> map = new HashMap<>();
            map.put(101, "Alice");
            map.put(102, "Bob");
            map.put(103, "Carol");
            map.clear();
            System.out.println(map);
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_11 *****");
            Map<Integer, String> map = Map.of(101, "Alice", 102, "Bob", 103, "Carol");
            System.out.println(map);
            System.out.println("=> end");
        }
    }
}