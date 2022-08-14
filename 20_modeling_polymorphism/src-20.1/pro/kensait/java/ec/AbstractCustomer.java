package pro.kensait.java.ec;

import java.util.Objects;

// Customerクラスとしての共通実装を提供する
public abstract class AbstractCustomer implements Customer {
    private Integer id;
    private String name;
    private Integer customerType;
    private String address;
    private Integer point;
    private boolean active;

    public AbstractCustomer(String name, Integer customerType, String address,
            Integer point) {
        this.name = name;
        this.customerType = customerType;
        this.address = address;
        this.point = point;
        this.active = true;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Integer getCustomerType() {
        return customerType;
    }

    @Override
    public void setCustomerType(Integer customerType) {
        this.customerType = customerType;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public Integer getPoint() {
        return point;
    }

    @Override
    public void setPoint(Integer point) {
        this.point = point;
    }

    @Override
    public boolean isActive() {
        return active;
    }

    @Override
    public void setActive(boolean active) {
        this.active = active;
    }

    // 抽象メソッドを記述することもできるが、インタフェースに記述した方が望ましい
    //public abstract void addPoint(Integer point);

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
