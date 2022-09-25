package pro.kensait.java.basic.lesson18_1_2.list;

import java.util.Arrays;
import java.util.List;

public class VariousListMain {

    public static void main(String[] args) {

        // 固定長のリストを生成する
        List<String> list1 = Arrays.asList("foo", "bar", "baz");
        list1.set(1, "qux");
        // list1.add("qux"); // エラー
        System.out.println(list1);

        // イミュータブルなリストを生成する
        List<String> list2 = List.of("foo", "bar", "baz");
        // list2.set(1, "qux"); // エラー
        // list2.add("qux"); // エラー
        System.out.println(list2);
    }
}