package pro.kensait.java.basic;

public class MatrixMain {

    public static void main(String[] args) {
        int[][] numbers = new int[2][2];
        numbers[0][0] = 0;
        numbers[0][1] = 1;
        numbers[1][0] = 10;
        numbers[1][1] = 11;
        System.out.println("numbers[0][0] ---> " + numbers[0][0]);
        System.out.println("numbers[0][1] ---> " + numbers[0][1]);
        System.out.println("numbers[1][0] ---> " + numbers[1][0]);
        System.out.println("numbers[1][1] ---> " + numbers[1][1]);
    }
}