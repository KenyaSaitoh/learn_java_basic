package pro.kensait.designpattern.templatemethod;

public class GeneralCustomerDeliveryFeeLogic extends DeliveryFeeLogic {

    private String str;

    public GeneralCustomerDeliveryFeeLogic(String str) {
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