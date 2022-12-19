package pro.kensait.java.basic.lsn_21_4_1;

public class Main_JVM_Param {
    public static void main(String[] args) {
        String programMode = System.getProperty("program.mode");
        System.out.println("program.mode => " + programMode);
    }
}