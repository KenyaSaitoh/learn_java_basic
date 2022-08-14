package pro.kensait.java.collection;

import java.util.Arrays;

public class ArraysMain {

    public static void main(String[] args) {
        // 配列を生成する。
        System.out.println("===== 配列を生成 =====");
        String[] values = { "E", "B", "D", "C", "A" };
        showArray(values);

        // 配列を自然順序付けでソートする。
        System.out.println("===== 配列を自然順序付けでソート =====");
        Arrays.sort(values);
        showArray(values);

        // 配列に要素を代入する。
        System.out.println("===== 配列に要素Xを代入 =====");
        String replaceValue = "X";
        Arrays.fill(values, 1, 3, replaceValue);
        showArray(values);
    }

    private static void showArray(String[] values) {
        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] + " ");
        }
        System.out.println("");
    }
}