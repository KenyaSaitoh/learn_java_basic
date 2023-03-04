package pro.kensait.java.cuifw;

public class ArrayHolder {
    private static int[] intArray;
    private static String[] strArray;
    public static int[] getIntArray() {
        return intArray;
    }
    public static void setIntArray(int[] intArray) {
        ArrayHolder.intArray = intArray;
    }
    public static String[] getStrArray() {
        return strArray;
    }
    public static void setStrArray(String[] strArray) {
        ArrayHolder.strArray = strArray;
    }
}