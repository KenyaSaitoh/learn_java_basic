package pro.kensait.java.lang;

public class ClassLoadMain {

    public static void main(String[] args) {
        try {
            Class clazz = Class.forName("org.study.se.lang.ClassLoadTarget");
            ClassLoadTarget target = (ClassLoadTarget)clazz.newInstance();
            System.out.println("ClassLoadTarget ---> " + target.getValue());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

/* ======================================== */
class ClassLoadTarget {

    private int value = 10;

    public int getValue() {
        return value;
    }
}