package pro.kensait.java.basic.lsn_21_3_3;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class Main {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        {
            System.out.println("***** snippet_1 *****");
            Locale locale1 = new Locale("ja"); // 「日本語」
            Locale locale2 = new Locale("ja", "JP"); // 「日本語と日本」
            Locale locale3 = new Locale("en", "US"); // 「英語とアメリカ」
            Locale locale4 = new Locale("en", "CA"); // 「英語とカナダ」
            Locale locale5 = new Locale("fr", "CA"); // 「フランス語とカナダ」
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_2 *****");
            Locale locale1 = Locale.JAPANESE; // 「日本語」
            Locale locale2 = Locale.JAPAN; // 「日本語と日本」
            Locale locale3 = Locale.US; // 「英語とアメリカ」
            Locale locale4 = Locale.CANADA; // 「英語とカナダ」
            Locale locale5 = Locale.CANADA_FRENCH; // 「フランス語とカナダ」
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_3 *****");
            Locale locale = Locale.getDefault();
            System.out.println(locale.getLanguage());
            System.out.println(locale.getCountry());
            System.out.println(locale.toLanguageTag());
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_4 *****");
            Locale locale = new Locale("en", "US"); //【1】
            ResourceBundle rb = ResourceBundle.getBundle("MyResource", locale); //【2】
            String name = rb.getString("name");
            int age = Integer.parseInt(rb.getString("age"));
            String address = rb.getString("address");
            System.out.println(name + ", " + age + ", " + address);
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_5 *****");
            NumberFormat nf1 = NumberFormat.getCurrencyInstance(); //【1】
            NumberFormat nf2 = NumberFormat.getCurrencyInstance(Locale.US); //【2】
            NumberFormat nf3 = NumberFormat.getCurrencyInstance(Locale.UK); //【3】
            String str1 = nf1.format(10000); // "¥10,000"
            String str2 = nf2.format(10000); // "$10,000.00"
            String str3 = nf3.format(10000); // "£10,000.00"
            System.out.println(str1);
            System.out.println(str2);
            System.out.println(str3);
            System.out.println("=> end");
        }
    }
}