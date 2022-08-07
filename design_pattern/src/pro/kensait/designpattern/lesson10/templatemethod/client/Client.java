package pro.kensait.designpattern.lesson10.templatemethod.client;

import java.math.BigDecimal;

import pro.kensait.designpattern.lesson10.templatemethod.provider.CoolDeliveryFeeLogic;
import pro.kensait.designpattern.lesson10.templatemethod.provider.DeliveryFeeLogic;
import pro.kensait.designpattern.lesson10.templatemethod.provider.TypeHolder.CustomerType;
import pro.kensait.designpattern.lesson10.templatemethod.provider.TypeHolder.ParcelType;
import pro.kensait.designpattern.lesson10.templatemethod.provider.TypeHolder.RegionType;

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