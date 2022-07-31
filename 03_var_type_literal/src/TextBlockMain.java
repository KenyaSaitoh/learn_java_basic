public class TextBlockMain {
    public static void main(String[] args) {
        String str = """
               こんにちは。
                   私はAlice、25歳です。
           日本語を話せます。
               """;
        System.out.println(str);
        String str2 = """
                こんにちは。
                      私はAlice、25歳です。
                
        私は日本語を話せます。
""";
      System.out.println(str2);
    }
}
