package pro.kensait.java.collection;

import java.util.ArrayList;
import java.util.List;

public class SublistMain {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i <= 100; i++) {
            list.add(i);
        }
        List<List<Integer>> resultList = splitList(list);
        printList(resultList);
    }

    private static <T> void printList(List<List<T>> listList) {
        for (List<T> list : listList) {
            System.out.println(list);
            System.out.println("##########");
        }
    }
    
    private static <T> List<List<T>> splitList(List<T> list) {
        List<List<T>> resultList = new ArrayList<List<T>>();
        int maxMultipleCount = 10;
        int splitedListUnit = 25;
        int listSize = list.size();
        int multipleCount = Double
                .valueOf(Math.ceil(listSize / splitedListUnit)).intValue(); // 切り上げ
        if (maxMultipleCount < multipleCount) {
            multipleCount = maxMultipleCount;
            if (listSize % multipleCount == 0) {
                splitedListUnit = listSize / multipleCount;
            } else {
                splitedListUnit = listSize / (multipleCount - 1);
            }
        }
        for (int i = 0;; i++) {
            int startPoint = i * splitedListUnit;
            int endPoint = startPoint + splitedListUnit;
            if (endPoint < listSize) {
                resultList.add(list.subList(startPoint, endPoint));
                continue;
            } else if (listSize == endPoint) {
                resultList.add(list.subList(startPoint, endPoint));
                break;
            } else if (listSize < endPoint) {
                endPoint = listSize;
                resultList.add(list.subList(startPoint, endPoint));
                break;
            }
        }
        return resultList;
    }
}
