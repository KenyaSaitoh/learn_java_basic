package pro.kensait.java.text;

import java.text.MessageFormat;

public class MessageFormatMain1 {

    public static void main(String[] args) {
        // メッセージ要素を設定する。
        Object[] argment = { "Foo", "Baz" };

        // インスタンスメソッドのformatを利用する。
        MessageFormat form = new MessageFormat("{0}さんは{1}さんの先輩です。");
        String message1 = form.format(argment);
        System.out.println("現在のパターン ---> " + form.toPattern());
        System.out.println("メッセージ出力 ---> " + message1);

        // インスタンスメソッドのformatを利用（パターン変更）する。
        form.applyPattern("{1}さんは{0}さんの後輩です。");
        String message2 = form.format(argment);
        System.out.println("現在のパターン ---> " + form.toPattern());
        System.out.println("メッセージ出力 ---> " + message2);

        // スタティックメソッドのformatを利用する。
        String message3 = MessageFormat.format("{0}さんと{1}さんは同僚です。", argment);
        System.out.println("メッセージ出力 ---> " + message3);
    }
}