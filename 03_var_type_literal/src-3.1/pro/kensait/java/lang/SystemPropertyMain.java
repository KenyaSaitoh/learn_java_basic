package pro.kensait.java.lang;

public class SystemPropertyMain {

    public static void main(String[] args) {
        System.out.println("java.home ---> " + System.getProperty("java.home"));
        System.out.println("java.version ---> " + System.getProperty("java.version"));
        System.out.println("java.vendor ---> " + System.getProperty("java.vendor"));
        System.out.println("java.class.version ---> " + System.getProperty("java.class.version"));
        System.out.println("java.ext.dirs ---> " + System.getProperty("java.ext.dirs"));
        System.out.println("os.name ---> " + System.getProperty("os.name"));
        System.out.println("os.version ---> " + System.getProperty("os.version"));
        System.out.println("user.name ---> " + System.getProperty("user.name"));
        System.out.println("user.home ---> " + System.getProperty("user.home"));
        System.out.println("file.separator ---> " + System.getProperty("file.separator"));
        System.out.println("path.separator ---> " + System.getProperty("path.separator"));
        System.out.println("line.separator ---> " + System.getProperty("line.separator"));
        System.out.println("Gaibu Parameter ---> " + System.getProperty("param"));
    }
}