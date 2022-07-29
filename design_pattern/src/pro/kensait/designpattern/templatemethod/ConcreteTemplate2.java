package pro.kensait.designpattern.templatemethod;

public class ConcreteTemplate2 extends AbstractTemplate {

    private String str;

    public ConcreteTemplate2(String str) {
        this.str = str;
    }

    public void open() {
        System.out.println("===============");
    }

    public void print() {
        System.out.println(str);
    }

    public void close() {
        System.out.println("===============");
    }
}