package pro.kensait.java.basic.lsn_18_1_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main_2 {
    public static void main(String[] args) {
        {
            System.out.println("***** snippet_1 *****");
            List<Integer> list = new ArrayList<Integer>();
            for (int i = 0; i < 10; i++) {
                list.add(i + 1); // 【1】1から10までの数値が格納されたリストを作る
            }
            List<Integer> subList = list.subList(3, 7); //【2】サブリストを作る
            System.out.println(subList);
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_2 *****");
            List<String> list1 = new ArrayList<>();
            list1.add("foo");
            list1.add("bar");
            List<String> list2 = new ArrayList<>();
            list2.add("baz");
            list2.add("qux");
            list1.addAll(list2); //【1】
            System.out.println(list1);
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_3 *****");
            List<String> list = Arrays.asList("foo", "bar", "baz");
            list.set(1, "qux"); // これはOK
            // list.add("qux"); // 実行時エラー
            System.out.println(list);
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_4 *****");
            List<String> list = List.of("foo", "bar", "baz");
            // list.set(1, "qux"); // 実行時エラー
            // list.add("qux"); // 実行時エラー
            System.out.println(list);
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_5 *****");
            List<String> list = List.of("foo", "bar", "baz");
            int s = list.size();
            System.out.println(s);
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_6 *****");
            List<String> list = List.of("foo", "bar", "baz");
            boolean flag = list.contains("foo");
            System.out.println(flag);
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_7 *****");
            List<String> list = new ArrayList<>();
            boolean flag = list.isEmpty();
            System.out.println(flag);
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_8 *****");
            List<String> list = List.of("foo", "bar", "baz");
            String[] strArray = list.toArray(new String[0]);
            for (String str : strArray) System.out.println(str);
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_9 *****");
            String[] strArray = {"foo", "bar", "baz"};
            List<String> list = Arrays.asList(strArray);
            System.out.println(list);
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_10 *****");
            List<Person> personList = new ArrayList<>(); //【1】
            Person alice = new Person("Alice", 25, "female");
            Person bob = new Person("Bob", 35, "male");
            personList.add(alice);
            personList.add(bob);
            System.out.println(personList);
            System.out.println("=> end");
        }
    }
}