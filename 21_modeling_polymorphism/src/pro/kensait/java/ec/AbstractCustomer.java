package pro.kensait.java.ec;

import java.util.Objects;

// Customerクラスとしての共通実装を提供する
public abstract class AbstractCustomer {
    protected Integer id;
    protected String name;
    protected Integer customerType; //TODO enum化
    protected String address;
    protected Integer point;
    protected boolean active;

    public AbstractCustomer(String name, Integer customerType, String address,
            Integer point) {
        this.name = name;
        this.customerType = customerType;
        this.address = address;
        this.point = point;
        this.active = true;
    }

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

    public Integer getCustomerType() {
        return customerType;
    }

    public void setCustomerType(Integer customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    // 購入金額の上限をチェックする（抽象メソッド）
    public abstract void checkTotalPrice(int totalPrice) throws Exception;

    // ポイントを加算する（抽象メソッド）
    public abstract void addPoint(int value);

    @Override
    public int hashCode() {
        return Objects.hash(address, id, name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        AbstractCustomer other = (AbstractCustomer) obj;
        return Objects.equals(address, other.address) && Objects.equals(id, other.id)
                && Objects.equals(name, other.name);
    }
}
