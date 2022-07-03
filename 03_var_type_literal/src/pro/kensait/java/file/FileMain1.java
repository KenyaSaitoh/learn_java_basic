package pro.kensait.java.file;

import java.io.File;

public class FileMain1 {

    public static void main(String[] args) {
        String fileName = args[0];
        File file = new File(fileName);
        System.out.println("pathSeparatorChar : " + File.pathSeparatorChar);
        System.out.println("separatorChar : " + File.separatorChar);
        System.out.println("getAbsolutePath = " + file.getAbsolutePath());
        System.out.println("getName = " + file.getName());
        System.out.println("getParent = " + file.getParent());
        System.out.println("getPath = " + file.getPath());
        System.out.println("isDirectory = " + file.isDirectory());
        System.out.println("isFile = " + file.isFile());
        System.out.println("lastModified = " + file.lastModified());
        System.out.println("length = " + file.length());
    }
}