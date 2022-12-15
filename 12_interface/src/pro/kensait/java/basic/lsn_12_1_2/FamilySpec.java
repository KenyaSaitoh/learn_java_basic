package pro.kensait.java.basic.lsn_12_1_2;

public interface FamilySpec {
    // 家族会員を取得する【①】
    CustomerBase[] getFamily();
    
    // 家族会員を設定する【②】
    void setFamily(CustomerBase[] family); 
    
    // 家族会員かどうかを判定する【③】
    default boolean isFamily(CustomerBase target) { 
        for (CustomerBase customer : getFamily()) {
            if (target.equals(customer)) return true;
        }
        return false;
    }
}