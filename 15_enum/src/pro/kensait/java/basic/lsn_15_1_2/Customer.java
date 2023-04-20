package pro.kensait.java.basic.lsn_15_1_2;

public class Customer {
    // フィールド
    private Integer id;
    private String name;
    private CustomerType customerType; //【1】顧客種別
    // コンストラクタ
    public Customer(Integer id, String name, CustomerType customerType) {
        this.id = id;
        this.name = name;
        this.customerType = customerType;
    }
    // アクセサーメソッド
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public CustomerType getCustomerType() {
        return customerType;
    }
    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }
    @Override
    public String toString() {
        return "Customer [id=" + id + ", name=" + name + ", customerType=" + customerType
                + "]";
    }
}
