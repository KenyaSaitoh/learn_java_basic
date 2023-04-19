package pro.kensait.java.basic.lsn_18_2_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        {
            System.out.println("***** snippet_1 *****");
            List<String> list = new ArrayList<>();
            Collections.addAll(list, "foo", "bar", "baz");
            List<String> il = Collections.unmodifiableList(list);
            System.out.println(il);
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_2 *****");
            List<String> list = new ArrayList<>();
            Collections.addAll(list, "foo", "bar", "baz");
            List<String> sl = Collections.synchronizedList(list);
            System.out.println(sl);
            System.out.println("=> end");
        }
    }
}