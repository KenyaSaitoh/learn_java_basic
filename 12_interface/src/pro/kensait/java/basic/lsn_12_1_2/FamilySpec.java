package pro.kensait.java.basic.lsn_12_1_2;

interface FamilySpec {
    //【1】家族会員を取得する
    CustomerBase[] getFamily();

    //【2】家族会員を設定する
    void setFamily(CustomerBase[] family); 

    //【3】家族会員かどうかを判定する
    default boolean isFamily(CustomerBase target) { 
        for (CustomerBase customer : getFamily()) {
            if (target.equals(customer)) return true;
        }
        return false;
    }
}