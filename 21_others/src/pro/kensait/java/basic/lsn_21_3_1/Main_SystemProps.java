package pro.kensait.java.basic.lsn_21_3_1;

public class Main_SystemProps {
    public static void main(String[] args) {
        System.out.println("java.home => " + System.getProperty("java.home"));
        System.out.println("java.version => " + System.getProperty("java.version"));
        System.out.println("java.vendor => " + System.getProperty("java.vendor"));
        System.out.println("java.vm.name => " + System.getProperty("java.vm.name"));
        System.out.println("java.class.path => " + System.getProperty("java.class.path"));
        System.out.println("jdk.module.main => " + System.getProperty("jdk.module.main"));
        System.out.println("jdk.module.path => " + System.getProperty("jdk.module.path"));
        System.out.println("java.class.version => " + System.getProperty("java.class.version"));
        System.out.println("os.name => " + System.getProperty("os.name"));
        System.out.println("os.version => " + System.getProperty("os.version"));
        System.out.println("user.name => " + System.getProperty("user.name"));
        System.out.println("user.home => " + System.getProperty("user.home"));
        System.out.println("user.dir => " + System.getProperty("user.dir"));
        System.out.println("file.separator => " + System.getProperty("file.separator"));
        System.out.println("path.separator => " + System.getProperty("path.separator"));
        System.out.println("line.separator => " + System.getProperty("line.separator"));
    }
}