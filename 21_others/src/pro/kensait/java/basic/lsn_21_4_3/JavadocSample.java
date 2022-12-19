package pro.kensait.java.basic.lsn_21_4_3;

import java.io.Serializable;

/**     
 * <p>クラスJavadocSampleの説明（概要）をここに書く。
 * クラスJavadocSampleの説明（詳細）をこれ以降に書く。</p>
 * <p>説明文中からリンク{@link Foo}を張ることもできる。</p>
 * @author  Kenya Saitoh
 * @version 1.2
 * @since   1.1
 * @see     Serializable
 * @see     Foo#foo
 */
public class JavadocSample extends Foo implements Serializable {
    /**
     * <p>フィールドdata1の説明をここに書く。</p>
     */
    int data1;
    /**
     * <p>フィールドdata2の説明をここに書く。</p>
     */
    int data2;

    /**
     * <p>コンストラクタの説明（概要）をここに書く。
     * コンストラクタの説明（詳細）をこれ以降に書く。</p>
     */
    public JavadocSample() {
    }
    /**
     * <p>メソッドmethod1の説明（概要）をここに書く。
     * method1の説明（詳細）をこれ以降に書く。</p> 
     *
     * @since      1.1
     * @param str1 引数str1の説明。
     * @param str2 引数str2の説明。
     * @return     戻り値の説明。
     * @exception  HogeException この例外がどんな状況で発生するか。
     */
    public String method1(String str1, String str2) throws HogeException {
        return str1 + str2;
    }

    /**
     * <p>メソッドmethod2の説明（概要）をここに書く。
     * method2の説明（詳細）をこれ以降に書く。</p>
     */
    private void method2() {
    }

    /**
     * <p>メソッドmethod3の説明（概要）をここに書く。
     * method3の説明（詳細）をこれ以降に書く。</p>
     * @deprecated 「VER1.xで廃止予定」など
     */
    public void method3() {
    }
}
