package pro.kensait.java.file;

import java.io.File;
import java.io.IOException;

public class FileMain2 {

    public static void main(String[] args) {
        String dirPath = args[0];
        String fileName = args[1];
        try {
            // ディレクトリの作成
            File file1 = new File(dirPath);
            if (file1.mkdirs()) {
                System.out.println("Directory Created ---> " + file1.getAbsolutePath());
            }
            // ファイルの作成
            File file2 = new File(dirPath, fileName);
            file2.createNewFile();
            // ファイルの存在確認
            System.out.println("File Exists ---> " + file2.exists());
            // ファイルの削除
            if (file2.delete()) {
                System.out.println("File Delete ---> " + file2.getAbsolutePath());
            }
            // ファイルの存在確認
            System.out.println("File Exists ---> " + file2.exists());
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}