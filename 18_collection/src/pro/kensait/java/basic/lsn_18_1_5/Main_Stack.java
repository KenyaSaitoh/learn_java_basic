package pro.kensait.java.basic.lsn_18_1_5;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main_Stack {
    public static void main(String[] args) {
        {
            System.out.println("***** snippet_1 *****");
            Deque<String> deque = new ArrayDeque<>();
            deque.offerFirst("foo");
            deque.offerFirst("bar");
            deque.offerFirst("baz");
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_2 *****");
            Deque<String> deque = new ArrayDeque<>();
            deque.offerFirst("foo");
            deque.offerFirst("bar");
            deque.offerFirst("baz");
            String element = deque.pollFirst();
            System.out.println(element);
            System.out.println("=> end");
        }
    }
}