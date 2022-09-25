package pro.kensait.java.basic.lesson18_2_1.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(10);
        list.add(3);
        Collections.sort(list);
        for (Integer value : list) {
            System.out.println(value);
        }
    }
}
