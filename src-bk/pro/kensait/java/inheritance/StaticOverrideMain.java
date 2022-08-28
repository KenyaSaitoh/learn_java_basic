package pro.kensait.java.inheritance;

public class StaticOverrideMain {

    public static void main(String[] args) {
        StaticOverrideSubClass.showMessage1();
        StaticOverrideSubClass.showMessage2();
    }
}

/* ======================================== */
class StaticOverrideSuperClass {

    public static void showMessage1() {
        System.out.println("===== スーパークラスのメッセージ1 =====");
    }

    public static void showMessage2() {
        System.out.println("===== スーパークラスのメッセージ2 =====");
    }
}

/* ======================================== */
class StaticOverrideSubClass extends StaticOverrideSuperClass {

    public static void showMessage2() { // showMessage2をオーバーライド
        System.out.println("===== サブクラスのメッセージ2 =====");
    }
}