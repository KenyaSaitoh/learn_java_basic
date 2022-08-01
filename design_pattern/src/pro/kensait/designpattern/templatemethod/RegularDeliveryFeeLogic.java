package pro.kensait.designpattern.templatemethod;

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