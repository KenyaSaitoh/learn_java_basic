package pro.kensait.java.lang;

import java.net.URL;
import java.net.URLClassLoader;

public class ClassLoaderMain {

    public static void main(String[] args) throws Exception {
        String jarUrlName = args[0];

        // 親となるシステムクラスローダのオブジェクトを取得する。
        ClassLoader superClassLoader = ClassLoader.getSystemClassLoader();

        // 読み込み先JARファイルのURLオブジェクトを作成する。
        URL[] urls = new URL[1];
        urls[0] = new URL(jarUrlName);

        // 指定されたURL、および親クラスローダについて、
        // 新しいURLClassLoaderを生成する。
        URLClassLoader urlClassLoader = new URLClassLoader(urls, 
                superClassLoader);

        // 指定された名前を持つクラスをロードする。
        Class clazz = urlClassLoader.loadClass("Foo");
        Object obj = clazz.newInstance();
        System.out.println(obj.toString());
    }
}

/* ======================================== */
class ClassLoaderTarget {

    private int value = 10;

    public int getValue() {
        return value;
    }
}