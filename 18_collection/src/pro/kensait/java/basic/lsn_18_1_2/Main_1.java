package pro.kensait.java.basic.lsn_18_1_2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main_1 {
    @SuppressWarnings({ "rawtypes", "unused" })
    public static void main(String[] args) {
        {
            System.out.println("***** snippet_1 *****");
            List<String> list = new ArrayList<String>();  // OKだが右辺は型推論可能
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_2 *****");
            List<String> list = new ArrayList<>(); // OK（基本形）
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_3 *****");
            ArrayList<String> list = new ArrayList<>(); // NG（左辺はインタフェースで宣言）
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_4 *****"); // NG（型パラメータを使う）
            List list = new ArrayList();
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_5 *****");
            List<String> list = new ArrayList<>(); //【1】
            list.add("foo"); //【2】
            list.add("bar"); //【3】
            list.add("baz"); //【4】
            System.out.println(list);
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_6 *****");
            List<String> list = new ArrayList<>();
            list.add("foo");
            list.add("bar");
            list.add("baz");
            list.add(1, "qux");
            System.out.println(list);
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_7 *****");
            List<String> list = new ArrayList<>();
            list.add("foo");
            list.add("bar");
            list.add("baz");
            list.set(1, "qux");
            System.out.println(list);
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_8 *****");
            List<String> list = new ArrayList<>();
            list.add("foo");
            list.add("bar");
            list.add("baz");
            String str = list.get(0);
            System.out.println(str);
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_9 *****");
            List<String> list = new ArrayList<>();
            list.add("foo");
            list.add("bar");
            list.add("baz");
            for (String str : list) {
                // 変数strに対して何らかの処理を行う
                System.out.println(str);
            }
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_10 *****");
            List<String> list = new ArrayList<>();
            list.add("foo");
            list.add("bar");
            list.add("baz");
            Iterator<String> iter = list.iterator(); //【1】
            while (iter.hasNext()) { //【2】
                String str = iter.next(); //【3】
                // 変数strに対して何らかの処理を行う
                System.out.println(str);
            }
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_11 *****");
            List<String> list = new ArrayList<>();
            list.add("foo");
            list.add("bar");
            list.add("baz");
            list.remove(1);
            System.out.println(list);
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_12 *****");
            List<String> list = new ArrayList<>();
            list.add("foo");
            list.add("bar");
            list.add("baz");
            boolean flag = list.remove("foo");
            System.out.println(list);
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_13 *****");
            List<String> list = new ArrayList<>();
            list.add("foo");
            list.add("bar");
            list.add("baz");
            list.clear();
            System.out.println(list);
            System.out.println("=> end");
        }
    }
}