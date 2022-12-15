package pro.kensait.java.basic.lsn_18_2_2.tree;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetMain {
    public static void main(String[] args) {

        // 1から10までの数値が格納されたセットを作成する
        SortedSet<Integer> sortedSet = new TreeSet<>();
        for (int i = 0; i < 10; i++) {
            sortedSet.add(i + 1);
        }

        // 部分集合を作る
        SortedSet<Integer> hs = sortedSet.headSet(5);
        System.out.println(hs);
        SortedSet<Integer> ts = sortedSet.tailSet(5);
        System.out.println(ts);
        SortedSet<Integer> ss = sortedSet.subSet(3, 7);
        System.out.println(ss);
    }
}