package pro.kensait.java.basic.lesson16_1_2;

public class Main1_Length {
    public static void main(String[] args) {
        {
            String str = "";
            for (int i = 0; i < 100000; i++) {
                str = str + "A";
            }
        }
        {
            StringBuilder sb = new StringBuilder("");
            for (int i = 0; i < 100000; i++) {
                sb.append("A");
            }
            String str = sb.toString();
        }
    }
}