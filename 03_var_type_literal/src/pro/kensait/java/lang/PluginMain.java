package pro.kensait.java.lang;

public class PluginMain {

    public static void main(String[] args) {
        try {
            // プラグイン1のクラスを動的に生成・ロードし、特定のメソッドを実行
            Class clazz1 = Class.forName("org.study.se.lang.PluginTarget1");
            PluginTargetIF target1 = (PluginTargetIF)clazz1.newInstance();
            System.out.println("PluginTarget1 ---> " + target1.getValue());
            // プラグイン2のクラスを動的に生成・ロードし、特定のメソッドを実行
            Class clazz2 = Class.forName("org.study.se.lang.PluginTarget2");
            PluginTargetIF target2 = (PluginTargetIF)clazz2.newInstance();
            System.out.println("PluginTarget2 ---> " + target2.getValue());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

/* ======================================== */
interface PluginTargetIF {

    int getValue();
}

/* ======================================== */
class PluginTarget1 implements PluginTargetIF {

    private int value = 10;

    public int getValue() {
        return value;
    }
}

/* ======================================== */
class PluginTarget2 implements PluginTargetIF {

    private int value = 20;

    public int getValue() {
        return value;
    }
}