package pro.kensait.java.basic.lsn_18_2_3.immutable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableListMain {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("foo");
        list.add("bar");
        list.add("baz");
        List<String> il = Collections.unmodifiableList(list);
    }
}