package pro.kensait.java.file;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileMain {

    public static void main(String[] args) {
        String fileName = args[0];
        String addString = args[1];
        try {
            // RandomAccessFileのオブジェクトを入出力両用で生成
            RandomAccessFile file = new RandomAccessFile(fileName, "rw");
            // 追加書き込み処理
            System.out.println("===== 追加書き込み処理開始 =====");
            long len = file.length(); // ファイルの長さの取得
            file.seek(len); // ファイルポインタを末尾にセット
            file.write(addString.getBytes("UTF-8")); // ファイルに書き込み
            // 読み込み処理
            System.out.println("===== 読み込み処理開始 =====");
            file.seek(0L); // ファイルポインタを先頭にセット
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            int c;
            while ((c = file.read()) != -1) { // 文字の読み込み
                baos.write(c);
            }
            byte[] b = baos.toByteArray();
            System.out.print(new String(b, "UTF-8")); // 標準出力へ出力
            System.out.println("");
            System.out.println("===== ファイル終了 =====");
            file.close(); // RandomAccessFile ストリームを閉じる
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}