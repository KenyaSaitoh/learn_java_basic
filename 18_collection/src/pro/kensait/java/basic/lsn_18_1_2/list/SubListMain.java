package pro.kensait.java.basic.lsn_18_1_2.list;

import java.util.ArrayList;
import java.util.List;

public class SubListMain {

    public static void main(String[] args) {
        // 1から10までの数値が格納されたリストを作成する
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i + 1);
        }

        // リストを分割してサブリストを作る
        List<Integer> subList = list.subList(3, 7); // 引数の2つ目は「そのインデックスの1つ前まで」という意味

        System.out.println(subList);
    }
}