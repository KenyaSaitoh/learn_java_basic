package pro.kensait.java.inheritance;

public class AbstractMain {

    public static void main(String[] args) {
        ConcreteTarget target = new ConcreteTarget("Foo");
        target.showMessage1();
        target.showMessage2();
    }
}

/* ======================================== */
abstract class AbstractTarget {

    private String message;

    // サブクラスから呼び出されることを想定してコンストラクタを宣言
    protected AbstractTarget(String message) {
        this.message = message;
    }

    // 抽象メソッド
    abstract void showMessage1();

    // 抽象クラス内でメソッドを実装可能（インタフェースとの違い）
    public void showMessage2() {
        System.out.println("Message from AbstractTarget ---> " + this.message);
    }

    public String getMessage() {
        return this.message;
    }
}

/* ======================================== */
class ConcreteTarget extends AbstractTarget {

    // 具象クラスのコンストラクタで、抽象クラスのコンストラクタを呼び出し
    // privateなフィールドを初期化
    public ConcreteTarget(String message) {
        super(message);
    }

    // 抽象メソッドを具象クラスでオーバーライド
    public void showMessage1() {
        // フィールドmessageはprivateなので、直接アクセスはできない
        System.out.println("Message from ConcreteTarget ---> " + getMessage());
    }
}