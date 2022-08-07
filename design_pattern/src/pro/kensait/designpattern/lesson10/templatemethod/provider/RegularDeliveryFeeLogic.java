package pro.kensait.designpattern.lesson10.templatemethod.provider;

import pro.kensait.designpattern.lesson10.templatemethod.provider.TypeHolder.CustomerType;
import pro.kensait.designpattern.lesson10.templatemethod.provider.TypeHolder.ParcelType;
import pro.kensait.designpattern.lesson10.templatemethod.provider.TypeHolder.RegionType;

public class RegularDeliveryFeeLogic extends DeliveryFeeLogic {

    public RegularDeliveryFeeLogic(ParcelType parcel, RegionType from, RegionType to,
            CustomerType customer) {
        super(parcel, from, to, customer);
        // TODO 自動生成されたコンストラクター・スタブ
    }

    @Override
    public void setUpBasicFee() {
        // TODO 自動生成されたメソッド・スタブ
        
    }

    @Override
    public void applyRegionRule() {
        // TODO 自動生成されたメソッド・スタブ
        
    }

    @Override
    public void applyBenefit() {
        // TODO 自動生成されたメソッド・スタブ
        
    }
}