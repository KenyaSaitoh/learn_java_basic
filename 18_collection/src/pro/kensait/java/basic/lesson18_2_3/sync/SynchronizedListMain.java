package pro.kensait.java.basic.lesson18_2_3.sync;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronizedListMain {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("foo");
        list.add("bar");
        list.add("baz");
        List<String> sl = Collections.synchronizedList(list);
    }
}