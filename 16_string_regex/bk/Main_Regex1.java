package pro.kensait.java.basic.lesson15_2_2;

public class Main_Regex1 {

    public static void main(String[] args) {
        {
            // パターン5
            String before = "Foo,FooCompany,Foo,FooCorporation";
            String after = before.replaceAll("\\bFoo\\b", "Hoge");
            System.out.println(" 5: " + before + " => " + after);
        }
        {
            // パターン6
            String before = "FooCompany";
            String after = before.replaceAll("[Fo]", "X");
            System.out.println(" 6: " + before + " => " + after);
        }
        {
            // パターン7
            String before = "FooCompany";
            String after = before.replaceAll("[^Fo]", "X");
            System.out.println(" 7: " + before + " => " + after);
        }
        {
            // パターン8
            String before = "FooCompany FooCorporation";
            String after = before.replaceAll("F........y", "HogeCompany");
            System.out.println(" 8: " + before + " => " + after);
        }
        {
            // パターン9
            String before = "xx,xxxxx xxxxxxx";
            String after = before.replaceAll("\\b\\w+\\b", "Hoge");
            System.out.println(" 9: " + before + " => " + after);
        }
        {
            // パターン10
            String before = "xx,xxxxx x xxxxxx";
            String after = before.replaceAll("\\b\\w{3,5}\\b", "Hoge");
            System.out.println("10: " + before + " => " + after);
        }
        {
            // パターン11
            String before = "FooCompany FooACompany FooAAACompany";
            String after = before.replaceAll("FooA?", "Hoge");
            System.out.println("11: " + before + " => " + after);
        }
        {
            // パターン12
            String before = "FooCompany FooACompany FooAAACompany";
            String after = before.replaceAll("FooA+", "Hoge");
            System.out.println("12: " + before + " => " + after);
        }
        {
            // パターン13
            String before = "FooCompany FooACompany FooAAACompany";
            String after = before.replaceAll("FooA*", "Hoge");
            System.out.println("13: " + before + " => " + after);
        }
        {
            // パターン14
            String before = "FooCompany is the best Company in the world";
            String after = before.replaceAll(".*Company", "HogeCompany");
            System.out.println("14: " + before + " => " + after);
        }
        {
            // パターン15
            String before = "FooCompany is the best Company in the world";
            String after = before.replaceAll(".*?Company", "HogeCompany");
            System.out.println("15: " + before + " => " + after);
        }
        {
            // パターン16
            String before = "FooCompany BarCompany";
            String after = before.replaceAll("(Foo|Bar)", "Hoge");
            System.out.println("16: " + before + " => " + after);
        }
        {
            // パターン17
            String before = "Company FooCompany";
            String after = before.replaceAll("(Foo)?Company", "HogeCompany");
            System.out.println("17: " + before + " => " + after);
        }
        {
            // パターン18
            String before = "Company FooCompany FooFooCompany";
            String after = before.replaceAll("(Foo)+Company", "HogeCompany");
            System.out.println("18: " + before + " => " + after);
        }
        {
            // パターン19
            String before = "Company FooCompany FooFooCompany";
            String after = before.replaceAll("(Foo)*Company", "HogeCompany");
            System.out.println("19: " + before + " => " + after);
        }
        {
            // パターン20
            String before = "FooCompany BarCompany";
            String after = before.replaceAll("(Foo|Bar)", "$1$1");
            System.out.println("20: " + before + " => " + after);
        }
        {
            // パターン21
            String before = "FooBarCompany";
            String after = before.replaceAll("(Foo)(Bar)", "$2$1");
            System.out.println("21: " + before + " => " + after);
        }
        {
            // パターン22
            String before = "FooCompany BarCompany FooCorporation";
            String after = before.replaceAll("(Foo|Bar)(Company|Corporation)", "Hoge$2");
            System.out.println("22: " + before + " => " + after);
        }
        {
            // パターン23
            String before = "FooCompany BarCompany FooCorporation BarCorporation";
            String after = before.replaceAll("(Foo|Bar)(?!Corporation)", "Hoge");
            System.out.println("23: " + before + " => " + after);
        }
        {
            // パターン24
            String before = "FooCompany BarCompany HogeCompany";
            String after = before.replaceAll("(?!Hoge)Company", "Corporation");
            System.out.println("24: " + before + " => " + after);
        }
        {
            // パターン25
            String before = "${rdbms}";
            String after = before.replaceAll("^\\$\\{(.*)\\}$", "$1");
            System.out.println("25: " + before + " => " + after);
        }
    }
}