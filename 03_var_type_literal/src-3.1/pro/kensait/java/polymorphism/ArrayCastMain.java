package pro.kensait.java.polymorphism;

public class ArrayCastMain {

    public static void main(String[] args) {
        // サブクラスの配列型変数を、スーパークラスの配列型変数に代入することはできる
        SubArray[] subArray1 = { new SubArray(), new SubArray() };
        SuperArray[] superArray1 = subArray1;
        for (int i = 0; i < superArray1.length; i++) {
            ((SubArray)superArray1[i]).method();
        }

        // スーパークラスのオブジェクトを、サブクラスの配列型変数に代入しようとすると、
        // コンパイルエラー
        // SubArray[] subArray2 = {new SuperArray(), new SuperArray()};

        // スーパークラスの配列型変数を、サブクラスの配列型変数に代入しようとすると、
        // キャスト演算子を使っていたとしても、実行時にClassCastExceptionが発生する
        SuperArray[] superArray3 = { new SuperArray(), new SuperArray() };
        @SuppressWarnings("unused")
        SubArray[] subArray3 = (SubArray[])superArray3;
    }
}

/* ======================================== */
class SuperArray {
}

/* ======================================== */
class SubArray extends SuperArray {

    void method() {
        System.out.println("This is SubArray");
    }
}