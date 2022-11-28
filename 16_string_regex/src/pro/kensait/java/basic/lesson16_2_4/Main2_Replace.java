package pro.kensait.java.basic.lesson16_2_4;

public class Main2_Replace {

    public static void main(String[] args) {
        {
            // パターン1
            String before = "FooCompany";
            String after = before.replaceAll("[a-z]", "x");
            System.out.println(" 1: " + before + " => " + after);
        }
        {
            // パターン2
            String before = "FooCompany is the best Company";
            String after = before.replaceAll("\\b\\w{3,5}\\b", "xxx");
            System.out.println(" 2: " + before + " => " + after);
        }
        {
            // パターン3
            String before = "Alice lives in Paris, Bob lived in Pari";
            String after = before.replaceAll("Paris?", "Paris");
            System.out.println(" 3: " + before + " => " + after);
        }
        {
            // パターン4
            String before = "FooCompany is the best Company";
            String after = before.replaceAll("^.*Company", "HogeCompany");
            System.out.println(" 4: " + before + " => " + after);
        }
        {
            // パターン5
            String before = "FooCompany is the best Company";
            String after = before.replaceAll("^.*?Company", "HogeCompany");
            System.out.println(" 5: " + before + " => " + after);
        }
        {
            // パターン6
            String before = "{foo}";
            String after = before.replaceAll("^\\{(.*)\\}$", "$1");
            System.out.println(" 6: " + before + " => " + after);
        }
        {
            // パターン7
            String before = "FooCompany BarCompany FooCorporation";
            String after = before.replaceAll("(Foo|Bar)(Company|Corporation)", "Hoge$2");
            System.out.println(" 7: " + before + " => " + after);
        }
        {
            // パターン8
            String before = "FooCompany FooCorporation BarFirm";
            String after = before.replaceAll("(Foo|Bar)(?!Company)", "Hoge");
            System.out.println(" 8 : " + before + " => " + after);
        }
    }
}