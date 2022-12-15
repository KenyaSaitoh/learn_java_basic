package pro.kensait.java.basic.lsn_21_3_3;

import java.util.Locale;

public class Main_Locale {
    public static void main(String[] args) {
        {
            Locale locale1 = new Locale("ja"); // 「日本語」
            Locale locale2 = new Locale("ja", "JP"); // 「日本語と日本」
            Locale locale3 = new Locale("en", "US"); // 「英語とアメリカ」
            Locale locale4 = new Locale("en", "CA"); // 「英語とカナダ」
            Locale locale5 = new Locale("fr", "CA"); // 「フランス語とカナダ」
        }
        {
            Locale locale1 = Locale.JAPANESE; // 「日本語」
            Locale locale2 = Locale.JAPAN; // 「日本語と日本」
            Locale locale3 = Locale.US; // 「英語とアメリカ」
            Locale locale4 = Locale.CANADA; // 「英語とカナダ」
            Locale locale5 = Locale.CANADA_FRENCH; // 「フランス語とカナダ」
        }
        {
            Locale locale = Locale.getDefault();
            System.out.println(locale.getLanguage());
            System.out.println(locale.getCountry());
            System.out.println(locale.getVariant());
            System.out.println(locale.toLanguageTag());
        }
    }
}