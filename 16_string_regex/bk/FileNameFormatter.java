package pro.kensait.java.basic.lesson15_2_2;

public class FileNameFormatter {
    public static void main(String[] args) {
        String fullFileName = "D:\\My Document\\Home\\fff.txt";
        String fileName = fullFileName.replaceAll("^.*(\\\\|\\/)(.*)$", "$2");
        System.out.println(fileName);
    }
}
