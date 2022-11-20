package pro.kensait.java.basic.lesson17_1_2;

public class Main2 {
    public static void main(String[] args) {
        CustomerType ct = CustomerType.DIAMOND;
        System.out.println(ct.name()); // "DIAMOND"
        System.out.println(ct.ordinal()); // 3
        System.out.println(ct.toString()); // "DIAMOND"
    }
}
