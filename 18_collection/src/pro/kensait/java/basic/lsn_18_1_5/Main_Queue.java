package pro.kensait.java.basic.lsn_18_1_5;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main_Queue {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        {
            System.out.println("***** snippet_1 *****");
            Deque<String> deque = new ArrayDeque<>();
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_2 *****");
            Deque<String> deque = new ArrayDeque<>();
            deque.offerLast("foo");
            deque.offerLast("bar");
            deque.offerLast("baz");
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_3 *****");
            Deque<String> deque = new ArrayDeque<>();
            deque.offerLast("foo");
            deque.offerLast("bar");
            deque.offerLast("baz");
            String element = deque.pollFirst();
            System.out.println(element);
            System.out.println("=> end");
        }
    }
}