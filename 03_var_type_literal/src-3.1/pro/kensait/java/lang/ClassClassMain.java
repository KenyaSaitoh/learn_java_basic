package pro.kensait.java.lang;

public class ClassClassMain {

    public static void main(String[] args) {
        String str1 = "Foo";
        String str2 = "Bar";
        Class clazz1 = str1.getClass();
        Class clazz2 = str2.getClass();
        if (str1.equals(str2)) {
            System.out.println("1と2は、同じ値");
        } else {
            System.out.println("1と2は、異なる値");
        }
        if (clazz1.equals(clazz2)) {
            System.out.println("1と2は、同じクラス");
        } else {
            System.out.println("1と2は、異なるクラス");
        }
        System.out.println("    1のクラス名 ---> " + clazz1.getName());
        System.out.println("    2のクラス名 ---> " + clazz2.getName());
    }
}