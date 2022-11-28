package pro.kensait.java.basic.lesson15_2_2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMain3 {

    public static void main(String[] args) {
        // パターン1
        String beforeString1 = "FooCompany";
        Pattern pattern1 = Pattern.compile("FooCompany");
        Matcher matcher1 = pattern1.matcher(beforeString1);
        String afterString1 = matcher1.replaceAll("BazCompany");
        System.out.println(" 1 : " + beforeString1 + " ---> " + afterString1);

        // パターン2
        String beforeString2 = "FooCompany FooCompany";
        Pattern pattern2 = Pattern.compile("FooCompany");
        Matcher matcher2 = pattern2.matcher(beforeString2);
        String afterString2 = matcher2.replaceFirst("BazCompany");
        System.out.println(" 2 : " + beforeString2 + " ---> " + afterString2);

        // パターン3
        String beforeString3 = "FooCompany";
        Pattern pattern3 = Pattern.compile("^Foo");
        Matcher matcher3 = pattern3.matcher(beforeString3);
        String afterString3 = matcher3.replaceAll("Baz");
        System.out.println(" 3 : " + beforeString3 + " ---> " + afterString3);

        // パターン4
        String beforeString4 = "FooCompany";
        Pattern pattern4 = Pattern.compile("^FooCompany$");
        Matcher matcher4 = pattern4.matcher(beforeString4);
        String afterString4 = matcher4.replaceAll("BazCompany");
        System.out.println(" 4 : " + beforeString4 + " ---> " + afterString4);

        // パターン5
        String beforeString5 = "BarCompany FooCompany Foo FooMarket";
        Pattern pattern5 = Pattern.compile("\\bFoo\\b");
        Matcher matcher5 = pattern5.matcher(beforeString5);
        String afterString5 = matcher5.replaceAll("Baz");
        System.out.println(" 5 : " + beforeString5 + " ---> " + afterString5);

        // パターン6
        String beforeString6 = "FooCompany";
        Pattern pattern6 = Pattern.compile("[Fo]");
        Matcher matcher6 = pattern6.matcher(beforeString6);
        String afterString6 = matcher6.replaceAll("X");
        System.out.println(" 6 : " + beforeString6 + " ---> " + afterString6);

        // パターン7
        String beforeString7 = "FooCompany";
        Pattern pattern7 = Pattern.compile("[^Fo]");
        Matcher matcher7 = pattern7.matcher(beforeString7);
        String afterString7 = matcher7.replaceAll("X");
        System.out.println(" 7 : " + beforeString7 + " ---> " + afterString7);

        // パターン8
        String beforeString8 = "FooCompany FooMarket";
        Pattern pattern8 = Pattern.compile("F........y");
        Matcher matcher8 = pattern8.matcher(beforeString8);
        String afterString8 = matcher8.replaceAll("BazCompany");
        System.out.println(" 8 : " + beforeString8 + " ---> " + afterString8);

        // パターン9
        String beforeString9 = "xx xxxxx xxxxxxx";
        Pattern pattern9 = Pattern.compile("\\b\\w{3,}\\b");
        Matcher matcher9 = pattern9.matcher(beforeString9);
        String afterString9 = matcher9.replaceAll("Baz");
        System.out.println(" 9 : " + beforeString9 + " ---> " + afterString9);

        // パターン10
        String beforeString10 = "xx xxxxx xxxxxxx";
        Pattern pattern10 = Pattern.compile("\\b\\w{3,5}\\b");
        Matcher matcher10 = pattern10.matcher(beforeString10);
        String afterString10 = matcher10.replaceAll("Baz");
        System.out.println("10 : " + beforeString10 + " ---> " + afterString10);

        // パターン11
        String beforeString11 = "FooCompany FooACompany FooAAACompany";
        Pattern pattern11 = Pattern.compile("FooA?");
        Matcher matcher11 = pattern11.matcher(beforeString11);
        String afterString11 = matcher11.replaceAll("Baz");
        System.out.println("11 : " + beforeString11 + " ---> " + afterString11);

        // パターン12
        String beforeString12 = "FooCompany FooACompany FooAAACompany";
        Pattern pattern12 = Pattern.compile("FooA+");
        Matcher matcher12 = pattern12.matcher(beforeString12);
        String afterString12 = matcher12.replaceAll("Baz");
        System.out.println("12 : " + beforeString12 + " ---> " + afterString12);

        // パターン13
        String beforeString13 = "FooCompany FooACompany FooAAACompany";
        Pattern pattern13 = Pattern.compile("FooA*");
        Matcher matcher13 = pattern13.matcher(beforeString13);
        String afterString13 = matcher13.replaceAll("Baz");
        System.out.println("13 : " + beforeString13 + " ---> " + afterString13);

        // パターン14
        String beforeString14 = "FooCompany is the best Company in the world";
        Pattern pattern14 = Pattern.compile("^.*Company");
        Matcher matcher14 = pattern14.matcher(beforeString14);
        String afterString14 = matcher14.replaceAll("BazCompany");
        System.out.println("14 : " + beforeString14 + " ---> " + afterString14);

        // パターン15
        String beforeString15 = "FooCompany is the best Company in the world";
        Pattern pattern15 = Pattern.compile("^.*?Company");
        Matcher matcher15 = pattern15.matcher(beforeString15);
        String afterString15 = matcher15.replaceAll("BazCompany");
        System.out.println("15 : " + beforeString15 + " ---> " + afterString15);

        // パターン16
        String beforeString16 = "FooCompany BarCompany";
        Pattern pattern16 = Pattern.compile("(Foo|Bar)");
        Matcher matcher16 = pattern16.matcher(beforeString16);
        String afterString16 = matcher16.replaceAll("Baz");
        System.out.println("16 : " + beforeString16 + " ---> " + afterString16);

        // パターン17
        String beforeString17 = "Company FooCompany";
        Pattern pattern17 = Pattern.compile("(Foo)?Company");
        Matcher matcher17 = pattern17.matcher(beforeString17);
        String afterString17 = matcher17.replaceAll("BazCompany");
        System.out.println("17 : " + beforeString17 + " ---> " + afterString17);

        // パターン18
        String beforeString18 = "Company FooCompany FooFooCompany";
        Pattern pattern18 = Pattern.compile("(Foo)+Company");
        Matcher matcher18 = pattern18.matcher(beforeString18);
        String afterString18 = matcher18.replaceAll("BazCompany");
        System.out.println("18 : " + beforeString18 + " ---> " + afterString18);

        // パターン19
        String beforeString19 = "Company FooCompany FooFooCompany";
        Pattern pattern19 = Pattern.compile("(Foo)*Company");
        Matcher matcher19 = pattern19.matcher(beforeString19);
        String afterString19 = matcher19.replaceAll("BazCompany");
        System.out.println("19 : " + beforeString19 + " ---> " + afterString19);

        // パターン20
        String beforeString20 = "FooCompany BarCompany";
        Pattern pattern20 = Pattern.compile("(Foo|Bar)");
        Matcher matcher20 = pattern20.matcher(beforeString20);
        String afterString20 = matcher20.replaceAll("$1$1");
        System.out.println("20 : " + beforeString20 + " ---> " + afterString20);

        // パターン21
        String beforeString21 = "FooBarCompany";
        Pattern pattern21 = Pattern.compile("(Foo)(Bar)");
        Matcher matcher21 = pattern21.matcher(beforeString21);
        String afterString21 = matcher21.replaceAll("$2$1");
        System.out.println("21 : " + beforeString21 + " ---> " + afterString21);

        // パターン22
        String beforeString22 = "FooCompany BarCompany FooMarket";
        Pattern pattern22 = Pattern.compile("(Foo|Bar)(Company|Market)");
        Matcher matcher22 = pattern22.matcher(beforeString22);
        String afterString22 = matcher22.replaceAll("Baz$2");
        System.out.println("22 : " + beforeString22 + " ---> " + afterString22);

        // パターン23
        String beforeString23 = "FooCompany BarCompany FooMarket BarMarket";
        Pattern pattern23 = Pattern.compile("(Foo|Bar)(?!Market)");
        Matcher matcher23 = pattern23.matcher(beforeString23);
        String afterString23 = matcher23.replaceAll("Baz");
        System.out.println("23 : " + beforeString23 + " ---> " + afterString23);

        // パターン24
        String beforeString24 = "FooCompany BarCompany BazCompany";
        Pattern pattern24 = Pattern.compile("(?!Baz)Company");
        Matcher matcher24 = pattern24.matcher(beforeString24);
        String afterString24 = matcher24.replaceAll("Market");
        System.out.println("24 : " + beforeString24 + " ---> " + afterString24);

        // パターン25
        String beforeString25 = "${rdbms}";
        Pattern pattern25 = Pattern.compile("^\\$\\{(.*)\\}$");
        Matcher matcher25 = pattern25.matcher(beforeString25);
        String afterString25 = matcher25.replaceAll("$1");
        System.out.println("25 : " + beforeString25 + " ---> " + afterString25);
    }
}