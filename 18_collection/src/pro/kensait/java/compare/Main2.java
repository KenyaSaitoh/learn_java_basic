package pro.kensait.java.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main2 {

    @SuppressWarnings("unchecked")
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
