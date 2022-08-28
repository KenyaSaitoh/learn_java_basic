package pro.kensait.java.inheritance;

public class MethodInheritanceMain {

    public static void main(String[] args) {
        MethodSubClass subClass = new MethodSubClass();
        subClass.showSuperClassMessage(); // 継承されたスーパークラスのメソッド呼び出し
        subClass.showSubClassMessage(); // サブクラスで追加されたメソッド呼び出し
    }
}

/* ======================================== */
class MethodSuperClass {

    public void showSuperClassMessage() {
        System.out.println("===== スーパークラスのメッセージ =====");
    }
}

/* ======================================== */
class MethodSubClass extends MethodSuperClass {

    public void showSubClassMessage() {
        System.out.println("===== サブクラスのメッセージ =====");
    }
}