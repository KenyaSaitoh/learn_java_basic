
public class MultiArrayMain {
    public static void main(String[] args) {
        int[][] scoreTable = {{80, 90, 100, 85}, {75, 70, 75, 70}, {95, 65, 75, 90}};
        int length1 = scoreTable.length; // ①
        int length2 = scoreTable[0].length; // ②
        System.out.println(length1 + "#" + length2);
    }
}
