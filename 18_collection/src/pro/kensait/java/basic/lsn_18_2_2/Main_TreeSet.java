package pro.kensait.java.basic.lsn_18_2_2;

import java.util.SortedSet;
import java.util.TreeSet;

public class Main_TreeSet {
    public static void main(String[] args) {
        // 1から10までの数値が格納されたセットを作成する
        SortedSet<Integer> sortedSet = new TreeSet<>(); //【1】
        for (int i = 0; i < 10; i++) {
            sortedSet.add(i + 1);
        }
        // 部分集合を作る
        SortedSet<Integer> hs = sortedSet.headSet(5); //【2】
        System.out.println(hs);
        SortedSet<Integer> ts = sortedSet.tailSet(5); //【3】
        System.out.println(ts);
        SortedSet<Integer> ss = sortedSet.subSet(3, 7); //【4】
        System.out.println(ss);
    }
}