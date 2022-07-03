package pro.kensait.java.lang;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ResourceFileAccessMain {

    public static void main(String[] args) {
        ResourceFileAccessMain mainClass = new ResourceFileAccessMain();
        mainClass.method();
    }

    private void method() {
        try {
            {
                // getClassを利用してリソースファイルにアクセスする方法
                InputStream is = getClass().getResourceAsStream(
                        "/org/study/se/lang/resource_sample.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(is));
                String str;
                while ((str = br.readLine()) != null) {
                    System.out.println(str);
                }
                br.close();
            }
            {
                // getClassLoaderを利用してリソースファイルにアクセスする方法
                ClassLoader classLoader = getClass().getClassLoader();
                InputStream is = classLoader.getResourceAsStream(
                        "org/study/se/lang/resource_sample.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(is));
                String str;
                while ((str = br.readLine()) != null) {
                    System.out.println(str);
                }
                br.close();
            }
            {
                // getContextClassLoaderを利用してリソースファイルにアクセスする方法
                ClassLoader classLoader = Thread.currentThread()
                        .getContextClassLoader();
                InputStream is = classLoader.getResourceAsStream(
                        "org/study/se/lang/resource_sample.txt");
                BufferedReader br = new BufferedReader(
                        new InputStreamReader(is));
                String str;
                while ((str = br.readLine()) != null) {
                    System.out.println(str);
                }
                br.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}