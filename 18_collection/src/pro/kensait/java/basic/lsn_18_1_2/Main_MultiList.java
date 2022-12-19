package pro.kensait.java.basic.lsn_18_1_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main_MultiList {
    public static void main(String[] args) {
        List<Integer> aliceScore = Arrays.asList(80, 90, 100, 85);
        List<Integer> bobScore = Arrays.asList(75, 70, 75, 60);
        List<Integer> carolScore = Arrays.asList(95, 65, 75, 90);
        List<List<Integer>> scores = new ArrayList<>();
        scores.add(aliceScore);
        scores.add(bobScore);
        scores.add(carolScore);
        System.out.println(scores);
    }
}