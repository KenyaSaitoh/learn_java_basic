package pro.kensait.java.basic.lsn_18_1_5.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackMain {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        deque.offerFirst("foo");
        deque.offerFirst("bar");
        deque.offerFirst("baz");
        deque.offerFirst("qux");

        String element1 = deque.pollFirst();
        System.out.println(element1);

        String element2 = deque.peekFirst();
        System.out.println(element2);

        String element3 = deque.removeFirst();
        System.out.println(element3);
    }
}