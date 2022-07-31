package pro.kensait.designpattern.templatemethod;

public class Client {

    public static void main(String[] args) {

        //
        DeliveryFeeLogic d1 = new GoldCustomerDeliveryFeeLogic('H');
        DeliveryFeeLogic d2 = new GeneralCustomerDeliveryFeeLogic("Hello World!");

        //
        d1.display();
        System.out.println("");
        d2.display();
    }
}