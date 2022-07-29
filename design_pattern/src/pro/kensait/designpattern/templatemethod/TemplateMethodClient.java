package pro.kensait.designpattern.templatemethod;

public class TemplateMethodClient {

    public static void main(String[] args) {

        //
        AbstractTemplate d1 = new ConcreteTemplate1('H');
        AbstractTemplate d2 = new ConcreteTemplate2("Hello World!");

        //
        d1.display();
        System.out.println("");
        d2.display();
    }
}