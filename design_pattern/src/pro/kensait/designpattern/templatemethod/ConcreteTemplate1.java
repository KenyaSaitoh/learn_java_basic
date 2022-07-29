package pro.kensait.designpattern.templatemethod;

public class ConcreteTemplate1 extends AbstractTemplate {

    private char ch;

    public ConcreteTemplate1(char ch) {
        this.ch = ch;
    }

    public void open() {
        System.out.print("");
    }

    public void print() {
        System.out.print(ch);
    }

    public void close() {
        System.out.println("");
    }
}