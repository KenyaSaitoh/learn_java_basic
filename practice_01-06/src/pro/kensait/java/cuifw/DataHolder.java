package pro.kensait.java.cuifw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataHolder {
    private static int[] intData;
    private static String[] stringData;

    public static int[] getIntArray() {
        return intData;
    }

    public static List<Integer> getIntList() {
        List<Integer> list = new ArrayList<>();
        for (int val : intData) {
            list.add(val);
        }
        return list;
    }

    public static void setIntData(int[] intData) {
        DataHolder.intData = intData;
    }

    public static List<String> getStringList() {
        return Arrays.asList(stringData);
    }

    public static String[] getStringArray() {
        return stringData;
    }

    public static void setStringData(String[] stringData) {
        DataHolder.stringData = stringData;
    }
}