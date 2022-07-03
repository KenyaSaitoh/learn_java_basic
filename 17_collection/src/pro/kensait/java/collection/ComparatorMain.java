package pro.kensait.java.collection;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ComparatorMain {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        File file1 = new File("file/A.txt");
        File file2 = new File("file/B.txt");
        File file3 = new File("file/C.txt");

        // リストを生成し、要素（ファイル）を登録する。
        List list = new ArrayList();
        System.out.println("===== リストを生成し、要素を登録 =====");
        list.add(file2);
        list.add(file3);
        list.add(file1);
        showList(list);

        // ファイル名でソートする。
        System.out.println("===== ファイル名でソート =====");
        Collections.sort(list, new FileNameComparator());
        showList(list);

        // ファイルサイズでソートする。
        System.out.println("===== ファイルサイズでソート =====");
        Collections.sort(list, new FileSizeComparator());
        showList(list);
    }

    public static void showList(List list) {
        Iterator i = list.iterator();
        while (i.hasNext()) {
            File file = (File)i.next();
            String fileName = file.getName();
            long fileSize = file.length();
            System.out.println(fileName + " / " + new Long(fileSize).toString());
        }
    }
}

/* ======================================== */
class FileNameComparator implements Comparator {

    public int compare(Object o1, Object o2) {
        File file1 = (File)o1;
        File file2 = (File)o2;
        String fileName1 = file1.getName();
        String fileName2 = file2.getName();

        // ファイル名で比較する。
        return fileName1.compareTo(fileName2);
    }
}

/* ======================================== */
class FileSizeComparator implements Comparator {

    public int compare(Object o1, Object o2) {
        File file1 = (File)o1;
        File file2 = (File)o2;
        int fileSize1 = (int)file1.length();
        int fileSize2 = (int)file2.length();

        // ファイルサイズで比較する。
        return fileSize1 - fileSize2;
    }
}