package pro.kensait.java.basic.lsn_18_2_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main_Collections {
    public static void main(String[] args) {
        {
            System.out.println("***** snippet_1 *****");
            List<Integer> list = new ArrayList<>();
            Collections.addAll(list, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
            System.out.println(list);
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_2 *****");
            List<Integer> list = new ArrayList<>();
            Collections.addAll(list, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
            Collections.reverse(list);
            System.out.println(list);
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_3 *****");
            List<Integer> list = new ArrayList<>();
            Collections.addAll(list, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
            Collections.rotate(list, -3);
            System.out.println(list);
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_4 *****");
            List<Integer> list = new ArrayList<>();
            Collections.addAll(list, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
            Collections.shuffle(list);
            System.out.println(list);
            System.out.println("=> end");
        }
    }
}