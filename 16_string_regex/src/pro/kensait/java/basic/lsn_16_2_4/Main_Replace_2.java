package pro.kensait.java.basic.lsn_16_2_4;

public class Main_Replace_2 {

    public static void main(String[] args) {
        {
            System.out.println("***** snippet_1 *****");
            String before = "FooCompany is the best Company";
            String after = before.replaceAll("\\b\\w{3,5}\\b", "xxx");
            System.out.println(before + " => " + after);
        }
        {
            System.out.println("***** snippet_2 *****");
            String before = "Alice lives in Paris, Bob lived in Pari";
            String after = before.replaceAll("Paris?", "Paris");
            System.out.println(before + " => " + after);
        }
        {
            System.out.println("***** snippet_3 *****");
            String before = "FooCompany is the best Company";
            String after = before.replaceAll("^.*Company", "HogeCompany");
            System.out.println(before + " => " + after);
        }
        {
            System.out.println("***** snippet_4 *****");
            String before = "FooCompany is the best Company";
            String after = before.replaceAll("^.*?Company", "HogeCompany");
            System.out.println(before + " => " + after);
        }
        {
            System.out.println("***** snippet_5 *****");
            String before = "{foo}";
            String after = before.replaceAll("^\\{(.*)\\}$", "$1");
            System.out.println(before + " => " + after);
        }
        {
            System.out.println("***** snippet_6 *****");
            String before = "FooCompany BarCompany FooCorporation";
            String after = before.replaceAll("(Foo|Bar)(Company|Corporation)", "Hoge$2");
            System.out.println(before + " => " + after);
        }
        {
            System.out.println("***** snippet_7 *****");
            String before = "FooCompany FooCorporation BarFirm";
            String after = before.replaceAll("(Foo|Bar)(?!Company)", "Hoge");
            System.out.println(before + " => " + after);
        }
    }
}