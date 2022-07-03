package pro.kensait.java.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMain2 {

    public static void main(String[] args) {
        String mail = "Foo@email.ne.jp";

        // 文字シーケンスの一部分をマッチング（lookingAt）する。
        System.out.println("===== 部分マッチング(lookingAt) =====");
        Pattern pattern1 = Pattern.compile("[\\w\\._-]+@");
        Matcher matcher1 = pattern1.matcher(mail);
        boolean flag1 = matcher1.lookingAt();
        int startPoint1 = matcher1.start();
        int endPoint1 = matcher1.end();
        String group1 = matcher1.group();
        System.out.println("部分マッチング結果 ---> " + flag1);
        System.out.println("スタートポイント ---> " + startPoint1);
        System.out.println("エンドポイント ---> " + endPoint1);
        System.out.println("グループ ---> " + group1);

        // 文字シーケンスの一部分をマッチング（find）する。
        System.out.println("===== 部分マッチング(find) =====");
        Pattern pattern2 = Pattern.compile("@[\\w\\._-]+");
        Matcher matcher2 = pattern2.matcher(mail);
        boolean flag2 = matcher2.find();
        int startpoint2 = matcher2.start();
        int endpoint2 = matcher2.end();
        String group2 = matcher2.group();
        System.out.println("部分マッチング結果 ---> " + flag2);
        System.out.println("スタートポイント ---> " + startpoint2);
        System.out.println("エンドポイント ---> " + endpoint2);
        System.out.println("グループ ---> " + group2);
    }
}