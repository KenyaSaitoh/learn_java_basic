package pro.kensait.java.inheritance;

public class FieldInheritanceMain {

    public static void main(String[] args) {
        System.out.println("===== サブクラスをnewしてサブクラス型変数に格納 =====");
        FieldSubClass subClass = new FieldSubClass();
        System.out.println("value1 ---> " + subClass.value1);
        System.out.println("value2 ---> " + subClass.value2);

        System.out.println("===== サブクラスをnewしてスーパークラス型変数に格納 =====");
        FieldSuperClass superClass = new FieldSubClass();
        System.out.println("value1 ---> " + superClass.value1);
        System.out.println("value2 ---> " + superClass.value2);
    }
}

/* ======================================== */
class FieldSuperClass {

    int value1 = 100;
    int value2 = 500;
}

/* ======================================== */
class FieldSubClass extends FieldSuperClass {

    int value2 = 1000;
}