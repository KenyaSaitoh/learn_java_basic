package pro.kensait.java.lang;

public class ArrayCopyMain {

    public static void main(String[] args) {
        String[] array1 = { "Foo", "Bar", "Baz" };
        String[] array2 = new String[array1.length];
        System.arraycopy(array1, 0, array2, 0, 2);
        System.out.println("===== コピー元配列 =====");
        ArrayCopyMain.printArray(array1);
        System.out.println("===== コピー先配列 =====");
        ArrayCopyMain.printArray(array2);
    }

    private static void printArray(Object[] obj) {
        for (int i = 0; i < obj.length; i++) {
            System.out.println(i + "番目の要素 ---> " + obj[i]);
        }
    }
}