package pro.kensait.java.character;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

public class UnicodeCharacterMain {

    public static void main(String[] args) throws Exception {
        // "あいう"をUnicodeで表現すると、以下のとおり
        char[] c = { '\u3042', '\u3044', '\u3046' };
        String str1 = new String(c);

        // 文字データ"あいう"をUnicodeからシフトJISのコード値に変換
        byte[] buf1 = str1.getBytes("Shift_JIS");
        ByteArrayInputStream bais = new ByteArrayInputStream(buf1);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        int c2;
        while ((c2 = bais.read()) != -1) {
            System.out.print(Integer.toHexString(c2));
            baos.write(c2);
        }
        System.out.println();

        // コード値をシフトJISでデコードし、文字データ"あいう"を出力
        byte[] buf2 = baos.toByteArray();
        String str2 = new String(buf2, "Shift_JIS");
        System.out.println(str2);
    }
}