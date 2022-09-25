package pro.kensait.java.basic.lesson18_1_5.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class QueueMain {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        deque.offerLast("foo");
        deque.offerLast("bar");
        deque.offerLast("baz");
        deque.offerLast("qux");

        String element1 = deque.pollFirst();
        System.out.println(element1);

        String element2 = deque.peekFirst();
        System.out.println(element2);

        String element3 = deque.removeFirst();
        System.out.println(element3);

        System.out.println("##### リストのサイズ #####");
        System.out.println("Size => " + deque.size());

        System.out.println("##### 要素の存在 #####");
        System.out.println("baz? => " + deque.contains("baz"));

        System.out.println("##### 要素を全件削除 #####");
        deque.clear();
        System.out.println("Empty? => " + deque.isEmpty());
    }
}