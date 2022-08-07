package pro.kensait.designpattern.lesson10.templatemethod.provider;

import java.math.BigDecimal;

import pro.kensait.designpattern.lesson10.templatemethod.provider.TypeHolder.CustomerType;
import pro.kensait.designpattern.lesson10.templatemethod.provider.TypeHolder.ParcelType;
import pro.kensait.designpattern.lesson10.templatemethod.provider.TypeHolder.RegionType;

public abstract class DeliveryFeeLogic {
    protected ParcelType parcel;
    protected RegionType from;
    protected RegionType to;
    protected CustomerType customer;
    protected BigDecimal deliveryFee;

    public DeliveryFeeLogic(ParcelType parcel, RegionType from, RegionType to,
            CustomerType customer) {
        this.parcel = parcel;
        this.from = from;
        this.to = to;
        this.customer = customer;
    }

    public abstract void setUpBasicFee();

    public abstract void applyRegionRule();

    public abstract void applyBenefit();

    public final BigDecimal calcFee() {
        setUpBasicFee();
        applyRegionRule();
        applyBenefit();
        return deliveryFee;
    }
}