package pro.kensait.java.inheritance;

public class OverrideMain {

    public static void main(String[] args) {
        OverrideSubClass subClass = new OverrideSubClass();
        subClass.showMessage1();
        subClass.showMessage2();
    }
}

/* ======================================== */
class OverrideSuperClass {

    public void showMessage1() {
        System.out.println("===== スーパークラスのメッセージ1 =====");
    }

    public void showMessage2() {
        System.out.println("===== スーパークラスのメッセージ2 =====");
    }
}

/* ======================================== */
class OverrideSubClass extends OverrideSuperClass {

    public void showMessage2() { // showMessage2をオーバーライド
        super.showMessage2(); // スーパークラスのメソッド呼び出し
        System.out.println("===== サブクラスのメッセージ2 =====");
    }
}