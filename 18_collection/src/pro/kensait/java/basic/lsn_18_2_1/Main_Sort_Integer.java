package pro.kensait.java.basic.lsn_18_2_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main_Sort_Integer {
    public static void main(String[] args) {
        {
            System.out.println("***** snippet_1 *****");
            List<Integer> list = new ArrayList<>();
            list.add(5);
            list.add(10);
            list.add(3);
            Collections.sort(list);
            System.out.println(list);
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_2 *****");
            List<Integer> list = new ArrayList<>();
            list.add(5);
            list.add(10);
            list.add(3);
            Collections.sort(list, Collections.reverseOrder());
            System.out.println(list);
            System.out.println("=> end");
        }
    }
}
