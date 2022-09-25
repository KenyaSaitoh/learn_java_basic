package pro.kensait.java.basic.lesson18_1_2.list;

import java.util.ArrayList;
import java.util.List;

public class ConcurrentModificationExceptionExample1 {

    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("kiwi");

        for (String item : fruits) {
            if (item.equals("apple")) {
                fruits.remove(item);
            }
        }
        System.out.println(fruits);
    }
}
