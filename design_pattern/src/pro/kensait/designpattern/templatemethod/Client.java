package pro.kensait.designpattern.templatemethod;

import java.math.BigDecimal;

public class Client {

    public static void main(String[] args) {

        //
        DeliveryFeeLogic d1 = new CoolDeliveryFeeLogic(ParcelType.LARGE,
                RegionType.HONSHU, RegionType.OKINAWA, CustomerType.PREMIUM);

        //
        BigDecimal fee = d1.calcFee();
        System.out.println(fee);
    }
}