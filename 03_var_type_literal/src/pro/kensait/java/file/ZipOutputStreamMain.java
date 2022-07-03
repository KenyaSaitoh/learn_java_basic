package pro.kensait.java.file;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipOutputStreamMain {

    public static void main(String[] args) {
        String zipFileName = args[0];
        try {
            // ZIPデータの出力先をファイル出力ストリームを用いて指定
            ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(zipFileName));
            // ZIPエントリ対象ファイル分ループし、ZIPエントリを生成
            for (int i = 1; i < args.length; i++) {
                String entryName = args[i];
                BufferedInputStream bis = new BufferedInputStream(new FileInputStream(entryName));
                ZipEntry entry = new ZipEntry(entryName);
                // 対象のZIPエントリの開始位置にZIP出力ストリームを配置
                zos.putNextEntry(entry);
                // 128バイトずつ読み込んでは出力ストリームに書き込み
                byte[] buf = new byte[128];
                int size;
                while ((size = bis.read(buf, 0, buf.length)) != -1) {
                    zos.write(buf, 0, size);
                }
                // ZIPエントリへの出力とクローズ
                zos.flush();
                zos.closeEntry();
                bis.close();
            }
            // ストリームのクローズ
            zos.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}