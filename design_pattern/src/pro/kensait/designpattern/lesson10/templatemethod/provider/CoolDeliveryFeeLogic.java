package pro.kensait.designpattern.lesson10.templatemethod.provider;

import java.math.BigDecimal;

import pro.kensait.designpattern.lesson10.templatemethod.provider.TypeHolder.CustomerType;
import pro.kensait.designpattern.lesson10.templatemethod.provider.TypeHolder.ParcelType;
import pro.kensait.designpattern.lesson10.templatemethod.provider.TypeHolder.RegionType;

public class CoolDeliveryFeeLogic extends DeliveryFeeLogic {

    public CoolDeliveryFeeLogic(ParcelType parcel, RegionType from, RegionType to,
            CustomerType customer) {
        super(parcel, from, to, customer);
    }

    @Override
    public void setUpBasicFee() {
        deliveryFee = switch(parcel) {
            case SMALL -> new BigDecimal(800);
            case MEDIUM -> new BigDecimal(1200);
            case LARGE -> new BigDecimal(1600);
        };
    }

    @Override
    public void applyRegionRule() {
        int distance = from.getDistance(to);
        BigDecimal additional = new BigDecimal(distance * 150);
        deliveryFee = deliveryFee.add(additional);
    }

    @Override
    public void applyBenefit() {
        if (customer == CustomerType.PREMIUM)
            deliveryFee = deliveryFee.subtract(new BigDecimal(200));
    }
}