package pro.kensait.java.character;

public class StringBufferMain {

    public static void main(String[] args) {
        // 文字列の調査
        StringBuffer sb1 = new StringBuffer();
        System.out.println("capacity : " + sb1.capacity());
        System.out.println("length : " + sb1.length());
        // 文字列の付加
        StringBuffer sb2 = new StringBuffer("abc");
        sb2 = sb2.append("def");
        System.out.println("append : " + sb2);
        // 文字列の挿入・削除
        StringBuffer sb3 = new StringBuffer("aaaaaa");
        sb3 = sb3.insert(3, "bbb");
        System.out.println("insert : " + sb3);
        System.out.println("delete : " + sb3.delete(3, 6));
        // 文字列の逆転
        StringBuffer sb4 = new StringBuffer("abcdefg");
        System.out.println("reverse : " + sb4.reverse());
    }
}
