package pro.kensait.designpattern2.plugin;

public class ClassLoadSample {

    public static void main(String[] args) {
        try {
            Class clazz1 = Class
                    .forName("org.study.pattern.plugin.ClassLoadTarget1");
            ClassLoadTargetIF target1 = (ClassLoadTargetIF)clazz1.newInstance();
            System.out.println("ClassLoadTarget1 ---> " + target1.getValue());
            Class clazz2 = Class
                    .forName("org.study.pattern.plugin.ClassLoadTarget2");
            ClassLoadTargetIF target2 = (ClassLoadTargetIF)clazz2.newInstance();
            System.out.println("ClassLoadTarget2 ---> " + target2.getValue());
        } catch (Exception e) {
            new RuntimeException(e);
        }
    }
}