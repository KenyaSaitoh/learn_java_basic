package pro.kensait.java.inheritance;

public class StaticMethodInheritanceMain {

    public static void main(String[] args) {
        StaticMethodSubClass.showSuperClassMessage(); // 継承されたスーパークラスのメソッド呼び出し
        StaticMethodSubClass.showSubClassMessage(); // サブクラスで追加されたメソッド呼び出し
    }
}

/* ======================================== */
class StaticMethodSuperClass {

    public static void showSuperClassMessage() {
        System.out.println("===== スーパークラスのメッセージ =====");
    }
}

/* ======================================== */
class StaticMethodSubClass extends StaticMethodSuperClass {

    public static void showSubClassMessage() {
        System.out.println("===== サブクラスのメッセージ =====");
    }
}