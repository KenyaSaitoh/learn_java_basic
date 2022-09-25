package pro.kensait.java.basic.lesson18_2_1.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsMain {

    public static void main(String[] args) {
        // 1から10までの数値が格納されたリストを作成する
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add(i + 1);
        }

        System.out.println("##### 最初の状態 #####");
        System.out.println(list);

        System.out.println("##### リストを左回りに3つ回転 #####");
        Collections.rotate(list, -3);
        System.out.println(list);

        System.out.println("##### リストをシャッフル #####");
        Collections.shuffle(list);
        System.out.println(list);

        System.out.println("##### リストを反転 #####");
        Collections.reverse(list);
        System.out.println(list);

        System.out.println("##### リストを自然順序付けの逆順でソート #####");
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}