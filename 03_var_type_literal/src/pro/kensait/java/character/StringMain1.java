package pro.kensait.java.character;

public class StringMain1 {

    public static void main(String[] args) {
        // 文字列の結合
        String str1 = "abc";
        String str2 = "def";
        System.out.println("concat : " + str1.concat(str2));
        // 文字列の切り出し
        String str3 = "abcdefghijklmn";
        System.out.println("substring : " + str3.substring(3, 6));
        // 文字列の検索
        String str4 = "abcabcabcabcdefabc";
        System.out.println("index : " + str4.indexOf("def"));
        System.out.println("Last : " + str4.lastIndexOf("abc"));
        // 文字列の変換
        String str5 = "AbCdEfG";
        System.out.println("UpperCase : " + str5.toUpperCase());
        System.out.println("LowerCase : " + str5.toLowerCase());
    }
}
