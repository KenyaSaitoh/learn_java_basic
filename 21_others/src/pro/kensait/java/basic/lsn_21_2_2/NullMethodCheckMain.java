package pro.kensait.java.basic.lsn_21_2_2;

public class NullMethodCheckMain {
    public static void main(String[] args) {
        //String str = String.valueOf(null);
        String str1 = "Foo_Bar_Foobar";
        String str2 = null;
        int result = str1.indexOf(str2);
    }
}