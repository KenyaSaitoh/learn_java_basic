package pro.kensait.java.regex;

public class FileNameFormatter {
    public static void main(String[] args) {
        String fullFileName = "D:\\My Document\\Home\\fff.txt";
        String fileName = fullFileName.replaceAll("^.*(\\\\|\\/)(.*)$", "$2");
        System.out.println(fileName);
    }
}
