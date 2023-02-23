package pro.kensait.java.basic.lsn_16_1_3;

public class Main_TextBlock {
    public static void main(String[] args) {
        String template = """
        %s様
        キャンペーンのお知らせ
        現在%sが通常価格の%d%%オフで購入可能です！
        """;
        String message1 = String.format(template, "Alice", "赤ワイン", 20);
        System.out.println(message1);
        String message2 = String.format(template, "Bob", "白ワイン", 30);
        System.out.println(message2);
    }
}