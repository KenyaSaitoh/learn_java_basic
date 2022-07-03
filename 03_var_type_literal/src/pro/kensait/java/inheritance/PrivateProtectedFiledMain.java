package pro.kensait.java.inheritance;

public class PrivateProtectedFiledMain {

    public static void main(String[] args) {
        SubClass sub = new SubClass("PRIVATE", "PROTECTED");
        sub.method();
    }
}

/* ======================================== */
class SuperClass {

    // privateなフィールドとアクセサメソッド
    private String privateValue;

    public void setPrivateValue(String privateValue) {
        this.privateValue = privateValue;
    }

    public String getPrivateValue() {
        return privateValue;
    }

    // protectedなフィールドとアクセサメソッド
    protected String protedtedValue;

    public void setProtedtedValue(String protedtedValue) {
        this.protedtedValue = protedtedValue;
    }

    public String getProtedtedValue() {
        return protedtedValue;
    }

    // コンストラクタ
    public SuperClass(String privateValue, String protedtedValue) {
        this.privateValue = privateValue;
        this.protedtedValue = protedtedValue;
    }
}

/* ======================================== */
class SubClass extends SuperClass {

    // スーパークラスのコンストラクタを呼び出し、フィールドに値を設定
    public SubClass(String privateValue, String protedtedValue) {
        super(privateValue, protedtedValue);
    }

    // スーパークラスのフィールドから値を取得
    public void method() {
        System.out.println(protedtedValue); // フィールド名を直接指定してアクセス可能
        System.out.println(getPrivateValue()); // アクセサメソッド経由で取得
    }
}