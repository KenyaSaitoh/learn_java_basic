package pro.kensait.designpattern.templatemethod;

public class GoldCustomerDeliveryFeeLogic extends DeliveryFeeLogic {

    private char ch;

    public GoldCustomerDeliveryFeeLogic(char ch) {
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